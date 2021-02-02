import java.util.Arrays;

/*
 * 교실에는 학생들이 여러명 있습니다
 * 교실은 학생들의 목록을 점수 순으로 정렬할 수 있어요.
 */
public class ClassRoom {
	public static void main(String[] args) {
		Student s1 = new Student("길동", 99);
		Student s2 = new Student("둘리", 75);
		Student s3 = new Student("마이클", 71);
		
		Student[] arr = new Student[] { s1, s2, s3 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
}
