# 02 클래스와 객체

### 클래스와 객체의 정의와 용도

- 클래스 

  - 클래스란 객체를 정의해 놓은 것이다.

  - 클래스는 객체를 생성하는데 사용한다.

- 객체 

  - 실제로 존재하는 것, 사물 또는 개념
  - 객체가 가지고 있는 기능과 속성에 따라 다름
  - 책상, 의자, 자동차, TV와 같은 사물
  - 수학 공식, 프로그램 에러오 같은 논리가 개념

    

### 객체와 인스턴스 

- 클래스로부터 객체를 만드는 과정을 `인스턴스화` 라고 한다.
- 클래스로부터 만들어진 객체를 `인스턴스`라고 한다.



### 객체의 구성요소 -  속성과 기능

- 속성 - 멤버변수, 특성, 필드, 상태
- 기능 - 메서드, 함수, 행위



### 인스턴스 생성과 사용

```java
클래스 변수명;
변수명 = new 클래스명();

TV t;
t = new TV()
```

```java
class Tv {
    //Tv의 속성(멤버면수)
    String color; 				//색상
    boolean power;				//전원상태
    int channel;				//채널
    //Tv의 기능(메서드)
    void power(){power = !power;}				//TV를 끄거나 켜는 기능을 하는 메서드
    void channelUp(){++channel;}				//TV의 채널을 높이는 기능을 하는 메서드
    void channelDown(){--channel;}				//TV의 채널을 낮추는 기능을 하는 메서드
    
  class TvTest{
      public static void main(Stigng args[]){
          Tv t;						//TV인스턴스를 참조하기 위한 변수 t를 선언
          t = new Tv();				//TV인스턴스를 생성한다.
          t.channel = 7;			//TV 인스턴스의 멤버 변수channel의 값을 7로 한다.
          t.channelDown();			//TV 인스턴스의 메서드 channelDown()을 호출한다.
          System.out.println("현재 채널은"+t.channel+"입니다.")
      }
  }
```



