# :rocket: 자바 기초
자바 기본기를 확실히 다지기 위한 공부로

핵심 내용과 내가 잘 숙지하지 못했던 부분 위주로 정리 (2023.12.28 ~ 2023.01.07)


# :page_facing_up: 목차
- <a href="#0"> 타입의 기본형과 참조형 </a> 
- <a href="#1"> 메서드 </a> 
- <a href="#2"> 오버로딩 </a>
- <a href="#3"> 클래스 </a>
- <a href="#4"> 객체(인스턴스) </a>
- <a href="#5"> NPE(Null Pointer Exception) </a>
- <a href="#6"> 생성자, this 키워드, this() </a> 
- <a href="#7"> 접근 제어자 4종류(private, default, protected, public) </a> 
- <a href="#8"> 캡슐화(하나의 클래스에 묶기, 접근 제어자 활용) </a>
- <a href="#9"> static 키워드, static 변수/메서드 </a> 
- <a href="#10"> final 키워드, 상수 </a>
- <a href="#11"> 상속 </a>
- <a href="#12"> 오버라이딩 </a>
- <a href="#13"> super 키워드 </a>
- <a href="#14"> super() 생성자 </a>
- <a href="#15"> 다형성, 케스팅 </a>
- <a href="#16"> instanceof </a>
- <a href="#17"> 추상 클래스, 추상 메서드, 순수 추상 클래스 </a>
- <a href="#18"> 인터페이스 </a>


## <b id="0"> 타입의 기본형과 참조형 </b>
- 자바의 변수 데이터 타입을 크게 기본형과 참조형로 분류할 수 있다.

  기본형을 제외한 나머지는 모두 참조형이다.
    
  - **기본형**
    - **사용하는 값을 직접 넣을 수 있는 데이터 타입**
    - ex) int, long, double, boolean 등
        
  - **참조형**
    - **메모리의 참조값을 넣는 것**으로

      **데이터에 접근하기 위한 참조를 저장하는 데이터 타입** 
    - ex) int[] students (배열 변수), Student student1(클래스 또는 객체를 담을 변수)


## <b id="1"> 메서드 </b>
- 자바에서는 함수를 메서드라고 부르고 **중복되는 코드를 메서드화 시켜서 재사용**할 수 있다.
- 또한 **메서드로 명확하게 분리**하면 **구조적으로 가독성을 높여주는 효과**와
    
    변경 사항이 발생하면 **관련된 메서드만 수정하면 되는 유지보수 관점**에서도 좋다.
    

- 메서드는 **인스턴스 메서드와 클래스 메서드**로 나뉜다.
  - 인스턴스 메서드
    - **static이 붙지 않은 메서드**로 **인스턴스를 생성해야 사용할 수 있다**.
            
  - 정적(클래스/static) 메서드
    - **static이 붙은 메서드**로 **인스턴스 생성과 무관하게 클래스로 바로 접근하여 사용**할 수 있다.


## <b id="2"> 오버로딩 </b>
- **이름이 같고 매개변수가 다른 메서드를 여러개 정의하는 것**이다.
- 이름이 같아도 **매개변수 타입 및 순서가 다르면 오버로딩**이 된다.
- 단, **반환 타입이 다른 것은 인정하지 않는다**.


## <b id="3"> 클래스 </b>
- 클래스란?
  - 사용자가 직접 필요한 **사용자 정의 타입인 객체를 만들기 위한 설계도**이다.

- 클래스가 왜 필요한가?
  - 자바의 **객체 지향 프로그래밍을 활용하기 위해 필요한 설계도**이다.


## <b id="4"> 객체(인스턴스) </b>
- **클래스라는 설계도를 활용하여 실제 메모리에 만들어진 실체**를
  객체 또는 인스턴스라고 합니다. (new Class명()으로 객체를 만듦)
    
  - 객체를 **생성하면 이 객체를 접근하는 참조값을 변수에 저장**한다.
  - 같은 클래스를 여러번 new로 생성한 객체들은 **서로 다른 독립된 객체**이다.
  - 인스턴스는 주로 객체가 어떤 클래스에 속해 있는지 강조할 때 사용한다.

    ex) student1 객체는 Student 클래스의 인스턴스다.
    
    <img src="https://github.com/K-Y-k/practice_java_basic/assets/102020649/53c15425-fe53-4d1d-bf3b-6d91ea83ad2e.gif" width="60%"/>
        
- 객체 vs 인스턴스
  - **인스턴스는 주로 객체가 어떤 클래스에 속해 있는지 강조할 때 사용**한다.

    ex) student1 객체는 Student 클래스의 인스턴스다.
  - **둘 다 클래스에서 나온 실체를 의미**하여 비슷하게 사용하지만,
    
    **특정 클래스 관계를 표현할 때 인스턴스 용어로 사용**하자.


## <b id="5"> NPE(Null Pointer Exception) </b>
- 참조 값이 없는 객체를 접근하면 null을 가리키게 되는데,
    
  즉, **null을 가리킬 때 발생하는 예외**이다.


## <b id="6"> 생성자, this 키워드, this() 생성자 </b>
- 생성자
  - 객체를 생성하자마자 즉시 필요한 기능을 좀 더 편리하게 수행할 수 있도록 생성자라는 기능을 제공한다.
    
- 생성자와 메서드의 차이점
  - **생성자의 이름은 클래스 이름과 같아야 한다**. (즉, **첫 글자도 대문자**)
  - **생성자는 반환 타입이 없다**.
    
- 생성자 장점
  - **메서드 사용시 발생하는 중복 호출을 제거**하고
    
     **생성 직후의 작업을 한번에 처리**할 수 있게 된다.
        
  - 메서드로 구현시 생성 메서드를 실수로 적용하지 않아도 컴파일 오류가 발생하지 않지만,
        
    생성자로 사용하면 **직접 정의한 생성자를 반드시 호출해야 하므로**
        
    **생성자를** **적용하지 않을시 컴파일 오류가 발생하는 제약을 해준다**.
    
- 생성자가 없으면?
  - 생성자는 반드시 호출해야 하므로
        
     **생성자가 없으면 자바에서 자동으로 기본 생성자를 만들고 호출**한다.
        
  - **생성자가 있으면 기본 생성자가 제공되지 않는다**.

- this 키워드
    ```
    public class MemberInit {
        String name;
        int age;
        int grade;
    
        // 객체 지향을 활용한 관련 클래스 내부에서 선언하여 사용하기
        // this는 현재 인스턴스인 MemberInit 자신의 참조값을 가져오는 것이다.
        void initMember(String name, int age, int grade) {
            this.name = name;   
            this.age = age;
            this.grade = grade;
        }
    }
    ```
    
    - 멤버 변수와 메서드의 매개변수 **이름이 같아질 때 구분하기 위한 것**
    - 즉, **인스턴스 자신의 참조값을 가리킨다**.
    - 멤버 변수와 메서드의 매개변수 이름이 다르면 this 생략 가능
        
      (헷갈리기 싫으면 무조건 this를 작성하는 코딩 스타일도 있지만,

      **최근에는 IDE에 색깔로 구분 가능해서 이름이 다르면 this 생략**한다.)
        
- this() 생성자
    ```
    public class MemberConstruct {
        String name;
        int age;
        int grade;
    
        // 기본 생성자 : 매개변수가 없는 생성자
        //             단, 직접 만든 생성자가 하나라도 있으면 자바는 기본 생성자를 만들지 않는다.
        public MemberConstruct() {
        }
    
        // 객체를 생성하자마자 즉시 필요한 기능을 좀 더 편리하게 수행할 수 있도록
        // 생성자라는 기능을 제공한다.
    
        // 생성자는 메서드와 비슷하지만 차이점이 있다.
        // 1.생성자의 이름은 클래스 이름과 같아야 한다. 즉, 첫 글자도 대문자로 시작한다.
        // 2.생성자는 반환 타입이 없다.
        // 3.나머지는 메서드와 같다.
        public MemberConstruct(String name, int age, int grade) {
            System.out.println("생성자 호출 name = " + name + ", age = " + ", grade = " + grade);
            this.name = name;
            this.age = age;
            this.grade = grade;
        }
    
        // 필요한 매개변수들만 구성하여
        // 생성자 오버로딩으로 추가
        MemberConstruct(String name, int age) {
            this(name, age, 50); // 이미 위에서 중복 생성자가 있어 this()로 해당 생성자를 불러온 것이다.
                                 // 즉, this()로 생성자 내부에서 자신의 생성자를 호출할 수 있다.
    //        코드 한줄로 중복되는 코드를 줄임
    //        this.name = name;
    //        this.age = age;
    //        this.grade = 50;
        }
    }
    ```
    
    - this()로 **생성자 내부에서 자신의 다른 생성자를 호출**할 수 있다.
    - 단, this()는 **생성자 코드의 첫줄에만 사용**할 수 있다.


## <b id="7"> 접근 제어자 4종류(private, default, protected, public) </b>
- **클래스, 필드, 생성자, 메서드에 접근을 허용하는 범위를 제한**하는 것이다.
- 단, **클래스 레벨의 접근 제어자는 public과 default만 가능**하다.
  - public일 경우 **파일명과 클래스명이 반드시 같아야한다**.
  - **하나의 자바 파일에 public 클래스는 하나만 가능**하다.

- private
  - **모든 외부 클래스에서의 직접 접근(호출)을 막는다**.
- default
  - **같은 패키지 안에서의 호출**은 허용한다.
- protected
  - **같은 패키지 안에서 호출**은 허용한다.
  - 추가로 **패키지가 다를 때는 상속 관계의 호출만** 허용한다.
- public
  - **모든 외부 클래스에서의 호출을 허용**한다.


## <b id="8"> 캡슐화(하나의 클래스에 묶기, 접근 제어자 활용) </b>
- **데이터와 해당 데이터를 처리하는 메서드를 하나의 클래스 안에 묶고**

  추가로 **접근 제어자를 활용**하여 **외부에서의 접근을 제한하는 것**을 말한다.
- 즉, **외부에 꼭 필요한 기능만 노출**하고
    
  **나머지(데이터, 외부에 사용하지 않는 기능들)는 접근 제어자로 모두 내부로 숨기는 것**이다.

```
public class BankAccount {
    private int balance;

    public BankAccount() {
        balance = 0;
    }

    // public 메서드 : 입금
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    // public 메서드 : 출금
    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    // public 메서드 : 금액 반환
    public int getBalance() {  // 멤버 변수 데이터 직접 접근을 private로 막았기에 메서드로 접근하여 값 반환한 것이다.
        return balance;
    }

    
    // private 메서드 : 금액양 확인
    // 이 메서드는 외부에서의 호출이 필요없는 기능이라서 prviate로 내부에서만 사용하도록 막음
    private boolean isAmountValid(int amount) {
        // 금액이 0보다 커야한다.
        return amount > 0;
    }
}
```


## <b id="9"> static 키워드, static 변수/메서드 </b>
```
public class Data3 {
    public String name;
    public static int count;   // 특정 클래스에서 공용으로 함께 사용할 변수에 static 키워드로 선언
                               // static이 붙은 멤버 변수는 인스턴스 영역에 생성되지 않는다!
                               // 힙 영역이 아닌 메서드 영역의 static 영역에서 관리하기 때문이다.
    public Data3(String name) {
        this.name = name;
        count++;               // 객체가 생성되면 생성자에서 정적 변수 count의 값을 하나 증가시킨다.
    }
}

public class DataCountMain3 {
    public static void main(String[] args) {
        // static을 활용한 방식
        // 클래스에 직접 접근하는 방식이 된다. -> Data3.count
        Data3 data1 = new Data3("A");
        System.out.println("A count = " + Data3.count); // 1

        Data3 data2 = new Data3("B");
        System.out.println("B count = " + Data3.count); // 2

        Data3 data3 = new Data3("C");
        System.out.println("C count = " + Data3.count); // 3
    }
}
```
- **객체(인스턴스)를 생성하지 않고 호출할 수 있는 키워드**이다.
- 즉, **공용으로 사용할 때** static을 사용한다.
- 주로 **멤버 변수와 메서드에 사용**된다.

  <img src="https://github.com/K-Y-k/practice_java_basic/assets/102020649/3a19e219-cd69-41a8-8cf1-eab6504f7b5a.gif" width="60%"/>

- **static 변수/정적 변수/클래스 변수**
  - **멤버 변수에 static이 붙인 변수이**다.
  - static 변수는 **인스턴스 영역에 생성되지 않고 클래스명. 으로 접근한다.**
        
    **힙 영역이 아닌 메서드 영역의 static 영역에서 관리하기 때문**이다.
        
    즉, static 변수는 **프로그램이 시작할 때** **JVM에 로딩되는 순간 생성되고**
        
    **JVM이 종료될 때까지 이어지기에 생존주기가 가장 길다**.
        
- **static 메서드/정적 메서드/ 클래스 메서드**
  - static 메서드는 **static 변수와 static 메서드만 사용할 수 있다**.
  - 정적 메서드의 대표적인 예시가 main()메서드이다.
      
    프로그램이 실행될 때 객체를 생성하지 않아도 작동했다.


## <b id="10"> final 키워드, 상수 </b>
- final 키워드
    - **더는 값을 변경할 수 없게 고정하는 키워드**이다.
    - **최초 1번만 할당**할 수 있고 **그 이후의 할당은 컴파일 오류**가 발생한다.
    - 즉, **매우 유용한 제약**으로 **특정 변수의 값을 할당한 이후 변경하지 않아야 한다면 final을 사용**하자.
    - **클래스에 final**이 붙으면 **상속을 할 수 없고**
        
        **메서드에 final**이 붙으면 **오버라이딩을 할 수 없다**.
        
    - **필드 초기화 방식은 3가지**가 있다.
        
        ```
        public class ConstructInit {
            final int value;                    // final을 필드에 사용할 경우
            // final 필드 - 필드 초기화
         // final int value = 10;               // 1.여기서 직접 초기화해주거나
        
            // static final 상수 필드 초기화 방식
        	  static final int CONST_VALUE = 10;  // static final은 상수로 변수명은 관례로 대문자와 _로 작성한다.
        
            // final 필드 - 생성자 초기화 방식
            public ConstructInit(int value) {   // 2.또는 생성자 호출에서 1번 할당하게 한다.
                this.value = value;
            }
        }
        
        public class FinalFieldMain {
            public static void main(String[] args) {
                // final 필드 - 생성자 초기화
                // 생성자 호출을 통해 value 필드 값을 초기화한 것
                // 생성자 호출은 초깃값을 1번 능동적으로 초기화하는 것에 의미가 있다.
                System.out.println("생성자 초기화");
                ConstructInit constructInit1 = new ConstructInit(10);
                ConstructInit constructInit2 = new ConstructInit(20);
                System.out.println(constructInit1.value);      // 10
                System.out.println(constructInit2.value);      // 10
        
                // final 필드 - 필드 초기화
                // 각 인스턴스에 고정된 value 필드 값이 들어간 것
                // 필드 초기화는 처음부터 고정된 값으로만 초기화되어
                // 모든 인스턴스가 같은 값을 사용하기에 중복이라 메모리 낭비
                System.out.println("필드 초기화");
                FiledInit filedInit1 = new FiledInit();    // value = 10
                FiledInit filedInit2 = new FiledInit();    // value = 10
                FiledInit filedInit3 = new FiledInit();    // value = 10
                System.out.println(filedInit1.value);      // 10
                System.out.println(filedInit2.value);      // 10
                System.out.println(filedInit3.value);      // 10
        
                // static final 상수 필드 초기화
                // static 영역을 활용하여 공유하는 필드로
                // 위 final 필드 초기화에서의 메모리 낭비 문제를 개선할 수 있다!
                // 즉, final 필드 초기화할 때는 static final 상수 방식을 이용하자
                System.out.println("상수");
                System.out.println(FiledInit.CONST_VALUE);  // static 변수라 인스턴스 생성없이 클래스명으로 접근
            }
        }
        ```
        
        - final 필드 - **생성자 초기화 방식**  : **주로 이 방식 사용**
        - final 필드 - 필드 초기화 방식         : 이 방식은 메모리 낭비
        - **static final 상수 필드 초기화 방식 : 공용으로 사용할 필드는 이 방식 사용**
        
- 상수
    
    ```java
    public class Constant {
        // 수학 상수
        public static final double PI = 3.14;
    
        // 시간 상수
        public static final int HOURS_IN_DAY = 24;
        public static final int MINUTES_IN_HOUR = 60;
        public static final int SECONDS_IN_MINUTE = 60;
    
        // 어플리케이션 설정 상수
        public static final int MAX_USERS = 1000;
    }
    ```
    
    - **변하지 않고 항상 일정한 값을 갖는 수**를 말한다.
    - 즉, **단 하나만 존재하고 변하지 않는 고정된 값**이다.
    - 그렇기에 **static final 키워드를 같이 사용**한다.
    - 그렇기에 **관례로 대문자와 _로 사용하여 구분**한다.


## <b id="11"> 상속 </b>
- **기존 클래스의 필드와 메서드를** **새로운 클래스에서 재사용하게 해준다**.
- 부모와 자식 클래스로 나뉜다.
  - 부모 클래스(슈퍼 클래스) : 상속을 통해 **자신의 필드와 메서드를 자식 클래스에 제공**하는 클래스
  - 자식 클래스(서브 클래스) : **부모 클래스로부터 필드와 메서드를 상속받는** 클래스
- 자바는 **여러 부모로 다중 상속이 불가능**하다.
    
    **하나의 부모인 단일 상속만 가능**하다.
    
- 상속의 장점
    - **부모의 기능을 재사용하여 중복이 줄어든다**.
    - **편리하게 확장**할 수 있다.

- 상속 메모리 구조
  
  <img src="https://github.com/K-Y-k/practice_java_basic/assets/102020649/3a19e219-cd69-41a8-8cf1-eab6504f7b5a.gif" width="60%"/>

  - **자식 객체를 생성 호출하면,**
    
    **상속 관계인 클래스도 함께 포함해서 인스턴스를 생성한다!**
    
    즉, **하나의 클래스 안에 부모, 자식 여러 클래스 정보가 공존**한다.
    
    **그렇기에 부모의 필드, 메서드를 재사용할 수 있었던 것**이다.
    
  - **기능을 호출할 때 현재 변수타입(클래스)을 먼저 기준**으로 선택한다.
    
    자식에서 찾지 못한 후에는 상위 부모 타입에서 찾는다.
    
  - 즉, **자식 생성자 호출할 때 반드시 첫줄에 부모 생성자 호출(super())도 있어야한다. (규칙)**
    
    자식의 기본 생성자는 이 부모 생성자 호출 코드가 기본으로 탑재되어 있어 생략된 것이었다.


## <b id="12"> 오버라이딩 </b>
- **부모에게 상속 받은 메서드를 자식 클래스에서 같은 메서드명으로 재정의하는 것**으로
    
    즉, 부모의 메서드가 아닌 **자식에서 재정의한 메서드로 호출하게 된다**.
    
- 오버라이딩한 **메서드 위에 @Override를 붙인다**.
    
    없어도 동작하는데 문제는 없지만, 실수로 이름을 다르게 작성하면 부모 메서드가 작동된다. (= 코드의 명확성)
    
- 메서드 오버라이딩은 **다형성과 함께 사용할 때 진정한 빛을 발휘**한다.
    - ex)
        
      부모 타입으로 선언된 변수이면 부모 타입의 필드와 메서드를 우선 접근한다.

      하지만, **오버라이딩 된 자식 메서드가 있다면 자식 메서드로 항상 우선권을 가진다**.
        
- 오버라이딩의 조건
    - **메서드 이름** 같아야 한다.
    - **메서드 파라미터의 타입, 순서, 개수** 같아야 한다.
    - **반환 타입** 같아야 한다.
    - **접근 제어자가** 부모 클래스의 메서드보다 **더 제한적이면 안된다**.
    - 부모 클래스의 메서드에 **static,** **final, private가 붙은 것은 오버라이딩할 수 없다**.
    - 부모 클래스의 메서드보다 **더 예외를 throws로 선언할 수 없다**.
    - **생성자는 오버라이딩할 수 없다**.


## <b id="13"> super 키워드 </b>
```
public class Parent {
    public String value = "parent";
		public String name = "Only parent_Field name";   // 부모만 있는 필드

    public void hello() {
        System.out.println("Parent.hello");
    }

		public String getName() { // 부모만 있는 필드를 사용하기 위한 메서드 선언
				return name;
		}
}

public class Child extends Parent {
    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child hello");
    }

    public void call() {
        // this는 현재 자신 클래스
        // this는 생략 가능하다. (보통 다른 매개변수명과 동일할 때 구분하려고 사용)
        System.out.println("this.value = " + this.value); 
        
        // super는 부모 클래스
        System.out.println("super.value = " + super.value);

        this.hello();
        super.hello();

        // 클래스 필드는 private로 캡슐화되어 super.필드명으로 직접 접근을 하지 못한다.
        // 그러므로 super.부모메서드명()으로 접근해서 부모만 있는 필드를 사용할 수 있다.
				System.out.println("super.name = " + super.getName());
    }
}
```
- super 키워드는 **부모 클래스에 대한 참조**를 뜻한다.
- 보통 **부모와 자식이 필드명이 같거나 메서드가 오버라이딩 된 경우**
    
  **자식의 필드, 메서드를 가져온다**.
    
  그렇기에 **자식과 겹치는 부모의 필드, 메서드로 호출하고 싶을 때 이 super 키워드를 사용하여 접근**한다.
- 또한 부모에만 있는 필드를 접근할 때
    
  보통 클래스 필드는 **private로 캡슐화 되어있어 자식 클래스에서 super.필드명으로 직접 접근을 하지 못한다**.
    
  그러므로 **부모 클래스에서 부모만 있는 필드를 꺼내거나 사용하는 메서드를 만들고**
    
  **자식 클래스에서 super.부모메서드명()으로 접근해서 부모만 있는 필드를 사용할 수 있다**.


## <b id="14"> super() 생성자 </b>
```
public class ClassA {
    public ClassA() { // 기본 생성
        System.out.println("ClassA 생성자");
    }
}

public class ClassB extends ClassA {
    public ClassB(int a) {       // 직접 정의한 생성자
        //super(); 부모 ClassA 클래스는 기본 생성자라서 생략 가능
        this(a, 0); // 만약 같은 클래스의 매개변수가 다른 생성자를 안에서 호출해도
                    // 결국 마지막 하나는 super()로 부모 생성 호출이 연결되어 있게 만들어야한다.
				System.out.println("ClassB 생성자 a=" + a);
    }

    public ClassB(int a, int b) { // 직접 정의한 생성자
        super();    // 부모 ClassA 클래스는 기본 생성자라서 생략 가능
        System.out.println("ClassB 생성자 a=" + a + " b=" + b);
    }
}

public class ClassC extends ClassB {
    public ClassC() {
        super(10, 20);  // ClassB에는 기본 생성자가 아닌 직접 정의한 생성자라서 생략할 수 없음
                        // ClassB(int a)와 ClassB(int a, int b)중 선택해야 한다.  
        System.out.println("ClassC 생성자");
    }
}
```
- **자식 생성자 호출할 때 반드시 첫줄에 부모 생성자 호출(super())도 있어야한다.**
- **첫줄에 super 생성자를 넣어야 해서 결국 최상위 부모부터 호출이 시작된다.**
- **부모 클래스가 기본 생성자이면 super() 생략이 가능**하다.
- 만약 **부모 클래스 생성자가 직접 정의되어 있으면,**
    
  **관련 매개변수를 넣어줘야 하므로 super()를 생략할 수 없다**.


## <b id="15"> 다형성, 케스팅 </b>
```
public static void main(String[] args) {
    // 부모 변수가 부모 인스턴스 참조
    System.out.println("Parent -> Parent");
    Parent parent = new Parent();
    parent.parentMethod();

    // 자식 변수가 자식 인스턴스 참조
    System.out.println("Child -> Child");
    Child child = new Child();    // 자식 인스턴스를 생성하면서 부모 인스턴스도 같이 포함되어 생성된다.
    child.parentMethod();         // 자식은 부모 메서드 사용 가능
    child.childMethod();


    // 부모 변수가 자식 인스턴스를 참조할 수 있다.(= 다형적 참조)
    System.out.println("Parent -> Child");
    Parent poly = new Child();    // 부모 타입은 자식 타입을 참조할 수 있다.
                                  // 자식 타입을 생성했기에 메모리 상 자식, 부모 인스턴스가 모두 생성된다.
    //Child poly2 = new Parent(); // 단, 반대로 자식 타입이 부모 타입을 참조할 수 없다.

    poly.parentMethod();
    
    // 다형적 참조의 한계 -> 캐스팅으로 해결
    // poly.childMethod();           하지만 결국 부모 타입이므로 부모 타입에 먼저 접근하게 되어
    //                               자식의 필드와 메서드는 사용할 수 없다.
}
```

- **다양한 형태로** 보통은 하나의 객체는 하나의 타입으로 고정이 되어 있는데,
    
  **다형성의 1번째 핵심은** **다형성은 한 객체가 여러 타입의 객체로 취급될 수 있는 능력 (다형성 참조)**을 뜻한다.
    
  - 즉, **부모는 자식 타입을 참조할 수 있다**. (= **업 케스팅**)
        
    다양한 형태를 참조할 수 있어 **다형적 참조라고 한다**.
        
  - 자식은 부모를 참조할 수 없어,
        
    **부모가 자식 타입을 참조하면 자식의 필드, 메서드는 사용할 수 없다**. (**다형적 참조의 한계**)
        
    이 때는 **다운 케스팅을 통해 해결**할 수 있다.
        
      ```
      public static void main(String[] args) {
          // 부모 변수가 지식 인스턴스 참조 (= 다형적 참조)
          Parent poly = new Child();     // 부모 x001, (업 캐스팅으로 생략되어있음)
      
          // 단, 자식의 기능은 호출 할 수 없다.
          //poly.childMehod();
      
          // 다운 캐스팅으로 자식 기능 호출 해결 (부모 타입 -> 자식 타입 형변환)
          // 1.강제 형변환 후 사용 방식
          Child child = (Child) poly;    // 부모 타입을 자식 타입으로 강제 형변환한 후 참조 값을 넣어준다.
          child.childMethod();
      
          // poly.childMethod();      위에서는 poly의 참조 값을 복사해서 대입한 것이기에 기존 poly 변수와는 아무 관련이 없다!
          //                          착각하지 말자!
      
          // 2.일시적 다운 캐스팅 방식 : 자식의 메서드를 호출하는 순간만 다운 캐스팅
          ((Child) poly).childMethod();  // 일시적으로 바꿔서 사용
          
      
          // 부모 인스턴스만 생성한 경우 자식의 인스턴스까지 포함되어 생성된 것이 아니기 때문에
          // 자식으로 강제 형변환할 수 없다.
          // 즉, 다운 캐스팅을 자동으로 하지 않는 이유가 이러한 경우를 대비해서 명시적 캐스팅만 허용한다.
          Parent parent1 = new Parent();    // 부모 인스턴스만 생성함
          //Child child2 = (Child) parent1; // 런타임 오류 - ClassCastException 예외 발생
          //child2.childMethod();           // 실행불가
      }
      ```
        
    - 업 케스팅(생략)과 다운 케스팅(생략불가)
      - **업 케스팅은 항상 상위 부모도 같이 생성되므로,**
                
         **문제가 발생할 수가 없어 생략**한다.
                
      - 하지만 **다운 캐스팅은**
                
        **부모 인스턴스만 생성했는데 자식 타입으로 다운 케스팅하려는 경우**에는 
                
        **자식 인스턴스를 찾을 수 없어 오류가 발생하므로 생략할 수 없고 명시적으로 다운 케스팅 해야 한다**!
                
        - **자식 인스턴스가** **생성됐는지 헷갈릴 경우,**
                    
          **instanceof 연산자로** 자식 인스턴스가 포함되어 있는지 **확인**해본다.

- **다형성의 2번째 핵심은**
    
  **선언 된 변수가 부모타입이어도 오버라이딩 된 자식 메서드를 항상 우선권을 가진다!**
    
  ```
  public class Parent {
      public String value = "parent";
  
      public void method() {
          System.out.println("Parent.method");
      }
  }
  public class Child extends Parent{
      public String value = "child";
  
      // 오버라이딩으로 재정의
      @Override
      public void method() {
          System.out.println("Child.method");
      }
  }
  
  public static void main(String[] args) {
      // 자식타입 변수가 자식 인스턴스 참조
      Child child = new Child();
      System.out.println("Child -> Child");
      System.out.println("child.value = " + child.value);   // "child"
      child.method();   // "Child.method"
  
      // 부모타입 변수가 부모 인스턴스 참조
      Parent parent = new Parent();
      System.out.println("Parent -> Parent");
      System.out.println("parent.value = " + parent.value); // "parent"
      parent.method(); // "Parent.method"
      
      
      // 부모타입 변수가 부모 + 자식 인스턴스 참조 (다형적 참조)
      Parent poly = new Child();
      System.out.println("Parent -> Child");
      System.out.println("poly.value = " + poly.value);    // "parent", 변수가 부모타입이기라서 부모타입으로 먼저 접근하기에 부모타입의 필드가 나온다.
  
      // 원래 변수의 타입을 기준으로 접근하는데 결국 오버라이딩 된 자식의 메서드가 나왔다.
      // 다형성의 2번째 핵심이다!
      // -> 선언 된 변수가 부모타입이어도 오버라이딩 된 자식 메서드를 항상 우선권을 가진다!
      poly.method();  // "Child.method"
  }
  ```
    
- **다형성**의 다형적 참조와 메서드 오버라이딩을 **활용해야하는 이유**
  - 코드의 중복을 줄이기 위해 보통 **메서드, 반복문, 배열 등을 활용하는데**
        
    이때 **부모 객체로 타입이 통일하여 묶을 수 있고 자식 메서드를 사용하기 위한 오버라이딩을 활용한다**!
        
    ```
    public class Animal {
        public void sound() {
            System.out.println("동물 울음 소리");
        }
    }
    public class Cat extends Animal {
        @Override         
        public void sound() {  // 메서드 오버라이딩
            System.out.println("야옹");
        }
    }
    
    public static void main(String[] args) {
        Dog dog = new Dog();   // 항상 부모 인스턴스까지 포함되어 생성
        Cat cat = new Cat();
        Caw caw = new Caw();
    
        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
    		
    		Animal[] animals = {dog, cat, caw};  // 다형성 특징 1.부모는 자식을 담을 수 있다.
    
        for (Animal animal : animals) {
            System.out.println("동물 소리 테스트 시작");
            animal.sound();                  // 다형성 특징 2.같은 이름의 메서드 오버라이딩한 자식 객체의 메서드로 우선시 된다.
            System.out.println("동물 소리 테스트 종료");
        }
    }
    
    // 추가 되어도 변하지 않는 부분
    // : 구체적인 객체 클래스를 참조하는 것이 아닌
    //   추상적인 부모를 참조하기 때문에 변하지 않는다.
    private static void soundAnimal(Animal animal) { // 다형성 특징 1.부모는 자식을 담을 수 있다. (다형적 참조)
        System.out.println("동물 소리 테스트 시작");
        animal.sound();                              // 다형성 특징 2.같은 이름의 메서드 오버라이딩한 자식 객체의 메서드로 우선시 된다.
        System.out.println("동물 소리 테스트 종료");
    }
    ```
    

- 다형성의 남은 문제점
  1. 제대로된 기능을 수행하지 않는 **추상적인 부모 인스턴스만 생성이 가능한 문제**
  2. 부모를 상속받은 자식 객체에서 **실수로 오버라이딩을 하지 않으면 부모의 메서드로 호출되는 문제**
- 다형성의 문제점 해결법 → 추상 클래스와 추상 메서드


## <b id="16"> instanceof </b>
- 다형성으로 참조하는 대상이 다양해져서,
    
  **어떤 인스턴스를** **참조하고 있는지 확인할 때 사용하는 연산자**이다.
  
  ```
    public class CastingMain5 {
      public static void main(String[] args) {
          Parent parent1 = new Parent();  // Parent 인스턴스만 생성
          call(parent1);
  
          Parent parent2 = new Child();   // Parent와 Child 인스턴스 같이 생성
          call(parent2);
      }
  
      // 현재 인스턴스가 사용할 자식 타입의 인스턴스가 포함되어 있는지 확인하기 위한 메서드
      private static void call(Parent parent) {
          if (parent instanceof Child) {       // Child 인스턴스가 존재하는지 확인
              // 존재하면
              System.out.println("Child 인스턴스 포함되어 있음");
              ((Child) parent).childMethod();  // 일시적으로 다운 케스팅한 후 자식 타입의 메서드를 사용
          } else {
              // 없으면
              System.out.println("Child 인스턴스 없음");
          }
      }
  }
  ```


## <b id="17"> 추상 클래스, 추상 메서드, 순수 추상 클래스 </b>
```
public abstract class Animal { // 추상 메서드가 하나라도 있으므로 추상 클래스로 선언
                               // 즉, 본인 인스턴스를 직접 생성할 수 없게 되었다.
    // 자식이 기능을 상속 받아 사용하도록 만든 기능
    public void move() {
        System.out.println("동물이 움직입니다.");
    }

    // 반드시 자식이 오버라이딩 해야하는 목적으로 만든 추상 메서드
    public abstract void sound();
}
public class Cat extends Animal{
    // 추상 클래스에 상속받은 추상 메서드는 강제적으로 구현되게 만듬
    @Override
    public void sound() {
        System.out.println("야옹");
    }
}

public static void main(String[] args) {
    // 추상 클래스는 생성 불가능
    // Animal animal = new Animal();

    Dog dog = new Dog();
    Cat cat = new Cat();
    Caw caw = new Caw();

    cat.sound(); // 자식 타입이므로 자식 메서드 호출
    cat.move();  // 자식 타입에는 없어서 부모 타입의 메서드 호출

    // 실수로 오버라이딩을 하지 않은 자식 메서드는 컴파일 오류
    soundAnimal(dog);
    soundAnimal(cat);
    soundAnimal(caw);
}

// 추가 되어도 변하지 않는 부분
// : 구체적인 객체 클래스를 참조하는 것이 아닌
//   추상적인 부모를 참조하기 때문에 변하지 않는다.
private static void soundAnimal(Animal animal) {  // 다형성 특징 1.부모는 자식을 담을 수 있다. (다형적 참조)
    System.out.println("동물 소리 테스트 시작");
    animal.sound();                               // 다형성 특징 2.같은 이름의 메서드 오버라이딩한 자식 객체의 메서드로 우선시 된다.
    System.out.println("동물 소리 테스트 종료");
}
```

- 추상 클래스
  - 본인을 직접 **생성하면 안되는 클래스**다.
  - ex) 추상화적인 개념을 제공하는 부모 클래스
- 추상 메서드
  - 부모 클래스를 상속 받는 자식 클래스에
      
    **반드시 오버라이딩 해야 하는 메서드를 부모 클래스에 정의하는 것이다. 즉, 메서드 바디가 없다.**
      
  - **추상 메서드가 하나라도 있으면 추상 클래스로 선언해야** 한다.
        
    작동하지 않는 메서드를 가진 불완전한 클래스이기 때문이다.
    
- 추상 클래스와 추상 메서드의 제약 덕분에 **다형성의 문제들을 해결해준다**.
  1. 제대로된 기능을 수행하지 않는 추상적인 부모 인스턴스만 생성이 가능한 문제
  2. 부모를 상속받은 자식 객체에서 실수로 오버라이딩을 하지 않으면 부모의 메서드 호출 문제

- 순수 추상 클래스 (= 인터페이스)
    
    ```
    public abstract class AbstractAnimal { 
        // 순수 추상 클래스는 상속을 물려받아서 사용하는 기능을 제공하는 것이 아닌
        // 다형성을 위해서 사용한다.
        
        // 반드시 자식이 오버라이딩 해야하는 목적으로 만든 추상 메서드
        public abstract void sound();
        public abstract void move();
    }
    ```
    
  - **추상 메서드만 있는 추상 클래스**
  - 즉, 실행 로직의 메서드가 없고
      
    단지 **다형성을 위한 부모 타입으로써 껍데기 역할만 제공**할 뿐이다.
      
  - 즉, 순수 추상 클래스는 **물려받아서 사용하는 상속의 특징을 제공하는 것이 아닌**
      
    **다형성을 위해서 사용**한다. 
      
  - 즉, 규격에 맞춰서 사용하는 인터페이스와 같다.
      
    이러한 **순수 추상 클래스의 개념은 프로그래밍에서 매우 자주사용되어**
      
    자바는 **순수 추상 클래스를 더 편리하게 사용할 수 있도록 인터페이스라는 개념을 제공**한다.
      
  - 사실 **인터페이스가 있으므로 순수 추상 클래스라는 개념이 없다**.


## <b id="18"> 인터페이스 </b>
```
public interface InterfaceAnimal {
    public static final int ab = 3;

    public abstract void sound(); // 추상 메서드만 가능하기에
    void move();                  // public abstract을 생략한다.
}
public class Cat implements InterfaceAnimal { // 인터페이스는 implements로 상속 받는다.
    @Override
    public void sound() {
        System.out.println("야용");
    }

    @Override
    public void move() {
        System.out.println("고양이 이동");
    }
}

public static void main(String[] args) {
    // 인터페이스는 순수 추상 클래스이므로 인스턴스를 생성할 수 없다.
    // InterfaceAnimal interfaceAnimal = new InterfaceAnimal();

    Cat cat = new Cat();  // 자식타입과 부모타입인 인터페이스 인스턴스도 포함되어 생성된다.
    Dog dog = new Dog();
    Caw caw = new Caw();

    soundAnimal(cat);
    soundAnimal(dog);
    soundAnimal(caw);
}

// 추가 되어도 변하지 않는 부분
// : 구체적인 객체 클래스를 참조하는 것이 아닌
//   추상적인 부모를 참조하기 때문에 변하지 않는다.
private static void soundAnimal(InterfaceAnimal animal) {  // 다형성 특징 1.부모는 자식을 담을 수 있다. (다형적 참조)
    System.out.println("동물 소리 테스트 시작");
    animal.sound();                                        // 다형성 특징 2.같은 이름의 메서드 오버라이딩한 자식 객체의 메서드로 우선시 된다.
    System.out.println("동물 소리 테스트 종료");
}
```

- 자바는 **순수 추상 클래스를 더 편리하게 사용할 수 있는 인터페이스라는 기능을 제공**한다.
    - **인스턴스를 생성할 수 없다**.
    - **상속시 모든 메서드를 오버라이딩 해야 한다**.
    - **다형성을 위해 사용**된다.
    - 추상 클래스의 모든 메서드는 public abstract이므로
        
        **메서드에 public abstract를 생략할 수 있다**. (생략 권장)
        
        멤버 변수는 public static final이고 생략할 수 있다. (생략 권장)
        
    - 인터페이스는 **다중 구현(다중 상속)을 지원**한다.
- 즉, 상속을 하지만 물려 받는 기능이 없으므로
    
    **인터페이스 상속이라는 개념이 아닌 인터페이스 구현한다고 표현**한다.
    
- 추상 클래스가 아닌 인터페이스를 사용해야 하는 이유
    - 제약
        1. **추상 메서드를 반드시 구현하라는 제약**을 준다.
        2. **다형성이라는 목적으로 모두 구현해야 한다고 구분해 주어**
            
            **로직이 있는 기능을 추가하지 못하게 원천적으로 차단할 수 있다. (단, 자바8에 등장한 default 메서드는 가능)**
            
    - 다중 구현(다중 상속)
      
      <img src="https://github.com/K-Y-k/practice_java_basic/assets/102020649/46af9f7c-c948-4afa-bbbd-7a565230c8fb.gif" width="40%"/>

      - 클래스 상속은 부모를 하나만 지정할 수 있지만
    
        **부모를 여러명 두는 다중 구현이 가능**하다.
 
- 클래스와 인터페이스를 함께 활용하는 예시

  <img src="https://github.com/K-Y-k/practice_java_basic/assets/102020649/f0a84114-9614-4444-bd59-60941ce076bb.gif" width="80%"/>

  ```
  // 추상화 클래스
  public abstract class AbstractAnimal {
      public abstract void sound();
  
      public void move(){
          System.out.println("동물이 이동합니다.");
      }
  }
  // 인터페이스
  public interface Fly {
      void fly();
  }
  
  public class Dog extends AbstractAnimal {
      @Override
      public void sound() {
          System.out.println("멍멍");
      }
  }
  
  public class Bird extends AbstractAnimal implements Fly {
      @Override
      public void sound() {
          System.out.println("짹짹");
      }
  
      @Override
      public void fly() {
          System.out.println("새 날기");
      }
  }
  
  public static void main(String[] args) {
      Dog dog = new Dog();
      Bird bird = new Bird();
  
      soundAnimal(dog);
      soundAnimal(bird);
  
      flyAnimal(bird);
  }
  
  // AbstractAnimal 추상 클래스 사용 가능
  private static void soundAnimal(AbstractAnimal animal) {  // 다형성 특징 1.부모는 자식을 담을 수 있다. (다형적 참조)
      System.out.println("동물 소리 테스트 시작");
      animal.sound();                                       // 다형성 특징 2.같은 이름의 메서드 오버라이딩한 자식 객체의 메서드로 우선시 된다.
      System.out.println("동물 소리 테스트 종료");
  }
  
  // Fly 인터페이스가 있으면 사용 가능
  private static void flyAnimal(Fly fly) {
      System.out.println("날기 테스트 시작");
      fly.fly()
      System.out.println("날기 테스트 종료");
  }
  ```

  - 추상 클래스는 단일 상속만 가능하고
  - 인터페이스는 다중 상속이 가능하다!
