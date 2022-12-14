// Generated by delombok at Tue Aug 16 18:58:13 CEST 2022

public class User {
	private String name;
	private String firstName;
	private String email;


	@java.lang.SuppressWarnings("all")
	public static class UserBuilder {
		@java.lang.SuppressWarnings("all")
		private String name;
		@java.lang.SuppressWarnings("all")
		private String firstName;
		@java.lang.SuppressWarnings("all")
		private String email;

		@java.lang.SuppressWarnings("all")
		UserBuilder() {
		}

		/**
		 * @return {@code this}.
		 */
		@java.lang.SuppressWarnings("all")
		public User.UserBuilder name(final String name) {
			this.name = name;
			return this;
		}

		/**
		 * @return {@code this}.
		 */
		@java.lang.SuppressWarnings("all")
		public User.UserBuilder firstName(final String firstName) {
			this.firstName = firstName;
			return this;
		}

		/**
		 * @return {@code this}.
		 */
		@java.lang.SuppressWarnings("all")
		public User.UserBuilder email(final String email) {
			this.email = email;
			return this;
		}

		@java.lang.SuppressWarnings("all")
		public User build() {
			return new User(this.name, this.firstName, this.email);
		}

		@java.lang.Override
		@java.lang.SuppressWarnings("all")
		public java.lang.String toString() {
			return "User.UserBuilder(name=" + this.name + ", firstName=" + this.firstName + ", email=" + this.email + ")";
		}
	}

	@java.lang.SuppressWarnings("all")
	public static User.UserBuilder builder() {
		return new User.UserBuilder();
	}

	@java.lang.SuppressWarnings("all")
	public String getName() {
		return this.name;
	}

	@java.lang.SuppressWarnings("all")
	public String getFirstName() {
		return this.firstName;
	}

	@java.lang.SuppressWarnings("all")
	public String getEmail() {
		return this.email;
	}

	@java.lang.SuppressWarnings("all")
	public void setName(final String name) {
		this.name = name;
	}

	@java.lang.SuppressWarnings("all")
	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	@java.lang.SuppressWarnings("all")
	public void setEmail(final String email) {
		this.email = email;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	public boolean equals(final java.lang.Object o) {
		if (o == this) return true;
		if (!(o instanceof User)) return false;
		final User other = (User) o;
		if (!other.canEqual((java.lang.Object) this)) return false;
		final java.lang.Object this$name = this.getName();
		final java.lang.Object other$name = other.getName();
		if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
		final java.lang.Object this$firstName = this.getFirstName();
		final java.lang.Object other$firstName = other.getFirstName();
		if (this$firstName == null ? other$firstName != null : !this$firstName.equals(other$firstName)) return false;
		final java.lang.Object this$email = this.getEmail();
		final java.lang.Object other$email = other.getEmail();
		if (this$email == null ? other$email != null : !this$email.equals(other$email)) return false;
		return true;
	}

	@java.lang.SuppressWarnings("all")
	protected boolean canEqual(final java.lang.Object other) {
		return other instanceof User;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	public int hashCode() {
		final int PRIME = 59;
		int result = 1;
		final java.lang.Object $name = this.getName();
		result = result * PRIME + ($name == null ? 43 : $name.hashCode());
		final java.lang.Object $firstName = this.getFirstName();
		result = result * PRIME + ($firstName == null ? 43 : $firstName.hashCode());
		final java.lang.Object $email = this.getEmail();
		result = result * PRIME + ($email == null ? 43 : $email.hashCode());
		return result;
	}

	@java.lang.Override
	@java.lang.SuppressWarnings("all")
	public java.lang.String toString() {
		return "User(name=" + this.getName() + ", firstName=" + this.getFirstName() + ", email=" + this.getEmail() + ")";
	}

	@java.lang.SuppressWarnings("all")
	public User() {
	}

	@java.lang.SuppressWarnings("all")
	public User(final String name, final String firstName, final String email) {
		this.name = name;
		this.firstName = firstName;
		this.email = email;
	}
}
