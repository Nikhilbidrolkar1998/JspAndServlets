package com.insurenceapp.model;

import java.util.List;

public class AppUser {
		private String userId;
		private String userName;
		private String password;
		private String email;
		private List<String> roles;
		public AppUser() {
			super();
		}
		public AppUser(String userId, String userName, String password, String email, List<String> roles) {
			super();
			this.userId = userId;
			this.userName = userName;
			this.password = password;
			this.email = email;
			this.roles = roles;
		}
		public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public List<String> getRoles() {
			return roles;
		}
		public void setRoles(List<String> roles) {
			this.roles = roles;
		}
		@Override
		public String toString() {
			return "AppUser [userId=" + userId + ", userName=" + userName + ", password=" + password + ", email="
					+ email + ", roles=" + roles + "]";
		}
		
}
