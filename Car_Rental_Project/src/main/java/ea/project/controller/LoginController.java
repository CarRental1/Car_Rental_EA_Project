package ea.project.controller;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping(value = {"/welcome" }, method = RequestMethod.GET)
	public ModelAndView defaultPage() {

	  ModelAndView model = new ModelAndView();
	  model.addObject("title", "Spring Security Login Form - Database Authentication");
	  model.addObject("message", "This is default page!");
	  model.setViewName("hello");
	  return model;

	}

	@RequestMapping(value = "/admin", method = RequestMethod.GET)
	public ModelAndView adminPage() {

	  ModelAndView model = new ModelAndView();
	  model.addObject("title", "Spring Security Login Form - Database Authentication");
	  model.addObject("message", "This page is for ROLE_ADMIN only!");
	  model.setViewName("admin");
	  return model;

	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(@RequestParam(value = "error", required = false) String error,
		@RequestParam(value = "logout", required = false) String logout) {

	  ModelAndView model = new ModelAndView();
	  if (error != null) {
		model.addObject("error", "Invalid username and password!");
	  }

	  if (logout != null) {
		model.addObject("msg", "You've been logged out successfully.");
	  }
	  model.setViewName("login");

	  return model;

	}

	//for 403 access denied page
	@RequestMapping(value = "/403", method = RequestMethod.GET)
	public ModelAndView accesssDenied() {

	  ModelAndView model = new ModelAndView();

	  //check if user is login
	  Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	  if (!(auth instanceof AnonymousAuthenticationToken)) {
		UserDetails userDetail = (UserDetails) auth.getPrincipal();
		model.addObject("username", userDetail.getUsername());
	  }

	  model.setViewName("403");
	  return model;

	}
//    
////	@RequestMapping("/")
////    public String redirectRoot() {
////        return "redirect:/register";
////    }
//	
////    @RequestMapping({"/","index"})
////    public String home(Model model){
//////        List<Product> products = productService.getRecentProducts();
//////        List<Category> categories = categoryService.getCategoryList();
//////        model.addAttribute("products", products);
//////        model.addAttribute("categories", categories);
////        return "index";
////    }
//
//   /* @RequestMapping("/ad")
//    public String adminhome(){
//        return "adminhome";
//    }
//*/
////    @RequestMapping("/login")
////    public String login(
////            @RequestParam(value="error", required = false)
////                    String error,
////            @RequestParam(value="logout", required = false)
////                    String logout,
////            Model model){
////
////        if(error != null){
////            model.addAttribute("error", "Invalid username and password");
////        }
////
////        if (logout !=null){
////            model.addAttribute("msg", "You have been logged out successfully");
////        }
////
////        return "login";
////    }
//
///*    @RequestMapping("/about")
//    public String about(){
//        return "about";
//    }*/
//    
////    @RequestMapping("/")
////    public String redirectRoot() {
////        return "redirect:/login";
////    }
//    
////    @RequestMapping("/home")
////    public String goLogin() {
////        return "/login";
////    }
//	@RequestMapping(value={"/login"}, method = RequestMethod.GET)
//	public String displayLoginForm() {
//		return "login";
//	}
//	
//    @RequestMapping("/home")
//    public String goAddCustomer() {
//        return "addCustomer";
//    }
}


