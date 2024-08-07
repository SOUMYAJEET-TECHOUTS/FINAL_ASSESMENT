package assessment;

public class Student {
	    private int id;
	    private String name;

	 
	    public Student(int id, String name) {
	        this.id = id;
	        this.name = name;
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

	    @Override
	    public int hashCode() {
	        final int prime = 31;
	        int result = 1;
	        result = prime * result + id;
	        result = prime * result + ((name == null) ? 0 : name.hashCode());
	        return result;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null || getClass() != obj.getClass())
	            return false;
	        Student other = (Student) obj;
	        if (id != other.id)
	            return false;
	        if (name == null) {
	            if (other.name != null)
	                return false;
	        } else if (!name.equals(other.name))
	            return false;
	        return true;
	    }

	    @Override
	    public String toString() {
	        return "Student [id=" + id + ", name=" + name + "]";
	    }

	    public static void main(String[] args) {
	        Student s1 = new Student(10, "soumya");
	        Student s2 = new Student(12, "shivam");


	        System.out.println("s1.equals(s2): " + s1.equals(s2)); // Should print true

	     
	        System.out.println("HashCode of s1: " + s1.hashCode());
	        System.out.println("HashCode of s2: " + s2.hashCode());

	 
	        System.out.println("s1.toString(): " + s1.toString());
	        System.out.println("s2.toString(): " + s2.toString());
	    }
	}


