

//write a java program to read student objects in arraylist and display the student
// result based on the condition that max&gt=80,distinction,between 60and 79 as
//first class, between 50 and 50 as second class, else faeil and display only
//students who are passed

class ArrayListStudent {
		int id;
		String name;
		double marks;
		public ArrayListStudent(int id, String name, double marks) {
			super();
			this.id = id;
			this.name = name;
			this.marks = marks;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getMarks() {
			return marks;
		}
		public void setMarks(double marks) {
			this.marks = marks;
		}
		@Override
		public String toString() {
			return id + " : " + name + " : " + marks;
	}
	}