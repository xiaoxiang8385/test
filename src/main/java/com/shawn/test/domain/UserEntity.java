package com.shawn.test.domain;

public class UserEntity {

		private Long id;
		private UserSexEnum userSex;
		private String passWord;
		private String nickName;
		private String userName;
		
		public UserEntity() {
			super();
		}
		
		
		public UserEntity(String userName, String passWord, UserSexEnum userSex) {
			super();
			this.userSex = userSex;
			this.passWord = passWord;
			this.userName = userName;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public UserSexEnum getUserSex() {
			return userSex;
		}
		public void setUserSex(UserSexEnum userSex) {
			this.userSex = userSex;
		}
		public String getPassWord() {
			return passWord;
		}
		public void setPassWord(String passWord) {
			this.passWord = passWord;
		}
		public String getNickName() {
			return nickName;
		}
		public void setNickName(String nickName) {
			this.nickName = nickName;
		}


		public String getUserName() {
			return userName;
		}


		public void setUserName(String userName) {
			this.userName = userName;
		}
		
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "userName " + this.userName + ", pasword " + this.passWord + "sex " + userSex.name();
		}
		
}
