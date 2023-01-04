package studentmanager;

public class Student {
	/* 3.학생클래스(별도생성)
	 * 학생클래스 : 한 학생의 정보를 나타내는 클래스
	 * 멤버변수 : 학번, 이름, 주민번호, 학부,학과, 수강과목s(과목클래스 배열생성) , 수강번지
	 * 멤버메서드 
	 * getter/setter , toString() or print() - 한 학생의 정보출력
	 * 수강과목추가 - 배열이 다 찼다면 늘려주기
	 * 수강과목삭제
	 * 생성자
	 * */
		private int stuNumber;
		private String stuName;
		private int stuKrnumber;
		private String faculty;
		private String stuCls;
		private Subject[] subjectList;
		private int stusubCount;
		
		
		public void stuPrint() {
			System.out.println("---학생정보---");
			System.out.println("학번 : "+stuNumber);
			System.out.println("학생명 : "+stuName);
			System.out.println("주민번호 : "+stuKrnumber);
			System.out.println("학부 :("+faculty+"), 학과 :("+stuCls+")");
			System.out.println("수강과목 :"+stusubCount);
		}
		
		@Override
		public String toString() {
			return "학생정보 [학번 :" + stuNumber + ", 이름 :" + stuName + ", 주민번호 :" + stuKrnumber
					+ ", 학부 :" + faculty + ", 학과 :" + stuCls + ", 수강과목 :" + subjectList + ", 수강과목수 :"
					+ stusubCount + "]";
		}
		//생성자
		public Student() {}

		public Student(int stuNumber, String stuName, int stuKrnumber, String faculty, String stuCls) {
			
			this.stuNumber = stuNumber;
			this.stuName = stuName;
			this.stuKrnumber = stuKrnumber;
			this.faculty = faculty;
			this.stuCls = stuCls;
			subjectList = new Subject[5];
		}

		public int getStuNumber() {
			return stuNumber;
		}

		public void setStuNumber(int stuNumber) {
			this.stuNumber = stuNumber;
		}

		public String getStuName() {
			return stuName;
		}

		public void setStuName(String stuName) {
			this.stuName = stuName;
		}

		public int getStuKrnumber() {
			return stuKrnumber;
		}

		public void setStuKrnumber(int stuKrnumber) {
			this.stuKrnumber = stuKrnumber;
		}

		public String getFaculty() {
			return faculty;
		}

		public void setFaculty(String faculty) {
			this.faculty = faculty;
		}

		public String getStuCls() {
			return stuCls;
		}

		public void setStuCls(String stuCls) {
			this.stuCls = stuCls;
		}

		public Subject[] getSubjectList() {
			return subjectList;
		}
		
		public int getStusubCount() {
			return stusubCount;
		}

		public void setSubjectList(Subject[] subjectList) {
			this.subjectList = subjectList;
		}

		//수강과목(앞에서 추가한 수강과목)을 print메서드
		public void print() {
			if(stusubCount==0) {
				System.out.println("수강중인 과목이 없습니다.");
			}
			for(int i=0; i<stusubCount; i++) {
				System.out.println(subjectList[i]); //toString이용하여 출력
//				subjectList[i].subPrint(); //subPrint메서드 호출
			}
		} 
		
		//수강과목 추가
		//매개변수 : subject subName
		//리턴타입 : void
		public void insertSubject(Subject subName) {
			//수강과목의 배열이 꽉 찼다면 배열을 늘려주는 작업
			if(stusubCount == subjectList.length) {
				// new 배열 생성
				Subject[] cnt = new Subject[stusubCount*2];
				//배열복사 System.Arraycopy(구배열,시작번지,신배열,시작번지,총개수)
				System.arraycopy(subjectList, 0, cnt, 0, subjectList.length);
				//새로 만든 배열로 연결
				subjectList = cnt; // 주소 연결
			}
			subjectList[stusubCount]= subName;
			stusubCount++;
		}
		//수강과목삭제
		//매개변수 : subName
		//리턴타입 : void
		public void deleteSubject(String subName) {
			int index=-1; // 찾는 과목의 위치
			//만약 매개변수의 과목이 없다면 return
			if (subName== null){
				return;
			}
			//subName이 subjectList에 있는지 확인
			for(int i=0; i<stusubCount; i++) {
				if(subjectList[i].getSubName().equals(subName)) {
					index = i;
					break;
				}
			}
			//만약 찾는 과목이 배열에 없다면 return
			if(index == -1) {
				return;
			}
			//찾는 위치부터 뒷번지 과목을 앞번지로 옮기는 작업 (삭제방법)
			for(int i=index; i<stusubCount-1; i++) {
				//뒷번지의 값을 앞번지로 덮어씀
				subjectList[i] = subjectList[i+1];
			}
			subjectList[stusubCount-1]= null;
			stusubCount--; // 번지수 감소
		}		
}