package hibernate_projects.sample_programs;


	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name="studentdata")

	public class Student
	{
		@Id //primary key 
		@Column(name="s_id")
		private int id;
		@Column(name="s_name")
		private String name;
		@Column(name="s_email")
		private String email;
		@Column(name="s_dob")
		private String dateOfBirth;


		public Student() {
			super();
			// TODO Auto-generated constructor stub
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
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(String string) {
			this.dateOfBirth = string;
		}
		
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", email=" + email + ", DOB=" + dateOfBirth + ", getId()=" + getId()
					+ ", getName()=" + getName() + ", getEmail()=" + getEmail() + ", getDateOfBirth()=" + getDateOfBirth() + ", getClass()="
					+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
		}

		
		
	}

