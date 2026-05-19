package com.example.demo;

public class StudentImpl implements Student {
		
		private String name;
		private double mobile;
		
		public StudentImpl() {
			// TODO Auto-generated constructor stub
		}

		public StudentImpl(String name, double mobile) {
			super();
			this.name = name;
			this.mobile = mobile;
		}

		public String getName() {
			return name;
		}


		public double getMobile() {
			return mobile;
		}


		@Override
		public String toString() {
			return "StudentImpl [name=" + name + ", mobile=" + mobile + "]";
		}

		@Override
		public void SetName(String name) {
			this.name = name;
			
		}


		@Override
		public void SetMobile(double mobile) {
			this.mobile = mobile;
			
		}
		
		
	
	

}
