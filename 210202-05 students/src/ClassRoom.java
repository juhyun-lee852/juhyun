import java.util.Arrays;

/*
 * ���ǿ��� �л����� ������ �ֽ��ϴ�
 * ������ �л����� ����� ���� ������ ������ �� �־��.
 */
public class ClassRoom {
	public static void main(String[] args) {
		Student s1 = new Student("�浿", 99);
		Student s2 = new Student("�Ѹ�", 75);
		Student s3 = new Student("����Ŭ", 71);
		
		Student[] arr = new Student[] { s1, s2, s3 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
}
