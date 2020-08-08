package studentassignment;
import java.util.*;

public class StudentMain {
	
		private Map<String, Student> map = new Map();

		public static void main(String[] args) {
			StudentMain run = new StudentMain();
			run.runApp();
		}

		public void runApp() {
			Student s1 =new Student("a1", 22, "vinay");
			Student s2 =new Student("a2", 24, "vinnet");
			Student s3 =new Student("a3", 25, "prasad");
			Student s4 =new Student("a4", 26, "teja");
			
			map.put("1",v1);
			map.put("2",z2);
			map.put("3",y3);
			map.put("4",x4);		
			
			app();
			
		}

		public void app() {
			Set<String> keys = map.keySet();
			for (String k : keys) {
				Student student = map.get(k);
				
				List<String>r= new ArrayList();
			    r.add(student.getRollNo());

				if (student.getAge() % 2 == 0) {
					List<Student> le = new ArrayList();
					le.add(map.get(k));

				} else {
					List<Student> lo = new ArrayList();
					lo.add(map.get( k));
				}
				
				for (String r1:r) {
					System.out.println(r1);
					
				}
			}

		}}





