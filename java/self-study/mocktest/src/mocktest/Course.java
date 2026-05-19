package mocktest;

public class Course {
	 private int courseId;
	    private String title;
	    private int marks;

	    public Course(int courseId, String title, int marks) {
	        this.courseId = courseId;
	        this.title = title;
	        this.marks = marks;
	    }

	    public int getCourseId() {
	        return courseId;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String toString() {
	        return "Course ID: " + courseId + ", Title: " + title + ", Marks: " + marks;
	    }
}
	
	


