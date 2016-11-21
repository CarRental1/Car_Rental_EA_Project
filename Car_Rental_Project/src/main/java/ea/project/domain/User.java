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

	@Enumerated(EnumType.STRING)
	private Role authority;

	@Column(nullable = true)
	boolean enabled;

	public Role getAuthority() {
		return authority;
	}

	public void setAuthority(Role authority) {
		this.authority = authority;
	}

	public boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

}
