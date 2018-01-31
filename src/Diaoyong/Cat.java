package Diaoyong;

public class Cat {
		public Cat(String name,int age) {
			this.name=name;
			this.age=age;
		}
		public Cat() {
			
		}
		public static String  kkk="wertuui";
			public String name;
			private int age;
			public char sex;
			public String type;
	
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
	    	}
	//		public char getSex() {
	//			return sex;
	//		}
	//		public void setSex(char sex) {
	//			this.sex = sex;
	//		}
	//		public String getType() {
	//			return type;
	//		}
	//		public void setType(String type) {
	//			this.type = type;
	//		}
	//		public void menthod() {
	//			System.out.println(name+"在走路");
	//		}
	        public int mul(int a,int b) {
	        	return a*b;
	        }
	        public float mul(int a,float b) {
	        	return a*b;
	        }
	        public float mul(int a,float b,float c) {
	        	return a*b*c;
	        }
	        public float mul(float b,int a) {
	        	return a*b;
	        }
	        public int mul(int a) {
	        	return a;
	        }
	        public static void jintai(){
	        	System.out.println("我是静态方法");
	        }
	}

