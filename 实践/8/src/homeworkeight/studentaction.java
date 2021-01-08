package homeworkeight;
import java.util.*;
class student implements Comparable{
	private String sid;
	private String sname;
	private int age;
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int compareTo(Object o) {
	      if (!(o instanceof student)) throw new RuntimeException("����student����");
	      student s = (student) o;
	      if (this.age > s.age)
	        return 1;
	      if (this.age == s.age){
	        return this.sname.compareTo(s.sname);
	      }
	      return -1;
	}
	public String toString() {
		return "ѧ��Ϊ��"+this.sid+" ����Ϊ��"+this.sname+" ����Ϊ��"+this.age;
	}
	
}
public class studentaction {

	public static void main(String[] args) {
		Set<student> studenttreeset = new TreeSet<student>();
		while(true){
			System.out.println("����ѧ�ţ�"); 
			Scanner in = new Scanner(System.in);
			String id = in.nextLine();
			if(!id.equals("exit")) {
				student s = new student();
				s.setSid(id);
				
				System.out.println("�������֣�");
				Scanner in1 = new Scanner(System.in);
				String name = in1.nextLine();
				s.setSname(name);
				
				System.out.println("�������䣺");
				Scanner in2 = new Scanner(System.in);
				int age = in2.nextInt();
				s.setAge(age);
				
				studenttreeset.add(s);
			}else {
				break;
			}
		}
		Iterator<student> it = studenttreeset.iterator();
		  while(it.hasNext()) {
		    student s = (student)it.next();
		    System.out.println(s);
		  }
		
	}

}
