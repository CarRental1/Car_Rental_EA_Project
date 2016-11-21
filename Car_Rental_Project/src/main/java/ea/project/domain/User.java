package ea.project.domain;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.hibernate.validator.constraints.NotEmpty;

@Embeddable
public class User {
	public enum Role {
		ROLE_USER, ROLE_ADMIN
	};

//	@Id
//	@GeneratedValue
//	private int id;

	@Column(unique = true)
	@NotEmpty(message = "The customer username must not be null")
	private String userName;

	@NotEmpty(message = "The customer password must not be null")
//	@Length(min = 6, message = "Password should be more than 5 characters")
	private String password;

	@Enumerated(EnumType.STRING)
	private Role authority;

	@Column(nullable = true)
	boolean enabled;

	public String getUserName() {
		return userName;
	}

	public void setUsername(String userName) {
		this.userName = userName;
	}

	public Role getAuthority() {
		return authority;
	}

	public void setAuthority(Role authority) {
		this.authority = authority;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("username='")
				.append(userName).append("', password='").append(password)
				.append("'");

		return sb.toString();
	}
}
