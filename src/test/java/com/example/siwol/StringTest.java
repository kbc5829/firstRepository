package com.example.siwol;

import org.apache.logging.log4j.util.Strings;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {

    @Test
    void testsiwolTo() {
//       List<String> list = new ArrayList<>();
//       list.add("1");
//       list.add("2");
//       assertThat(list).contains("1","2");

        String data = "1,2";
        String[] results = data.split(",");
        assertThat(results).contains("2", "1");
    }
   /*  public static void main(String[] args) {
         //for문을 이용해서 1부터 100까지 숫자 중 짝수만 출력해 보세요
         for (int i = 1; i <= 100; i++) {
             if (i % 2 == 0)
                 System.out.println(i);
         }
     }*/
       public int conditionTest(int value){
           // 변수 value가 선언되어 있다고 가정하고 아래에 코드를 작성하세요.
           int ret = 0;
           if( value % 3 == 0 ){
               ret = 3;
           }// 이 아래 줄에 else 구문을 추가해서 코드를 완성하세요.
           else if( value % 4 ==0) ret = 4;
           // 결과 체크를 위한 코드입니다.
           return ret;
       }

       //아래는 실행을 위한 코드입니다. 수정하지 마세요.
       public static void main(String[]args){
           StringTest exam = new StringTest();
           exam.conditionTest(6);
           exam.conditionTest(8);
       }
   }
//
//    @Test
//    void testsiwol2To () {
//        String str ="(1,2)";
//        str = str.substring(1, 4);
//        assertThat(str).contains("1,2");
//    }
//
//    @Test
//    @DisplayName("StringIndexOutOfBoundsException 예외처리 테스트")
//    void testsiwol3To () {
//        String str ="abc";
//        assertThatThrownBy(() -> {
//            char data = str.charAt(3);
//        }).isInstanceOf(StringIndexOutOfBoundsException.class)
//                .hasMessageContaining("ㅇ0ㅇ00ㅇ0ㅇ0ㅇㅇㅇ");
//    }

    /*private Set<Integer> numbers;
    @BeforeEach
    void setup(){
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
    }
//    @Test*/
//    void Test(){
//        assertThat(numbers.size()).isEqualTo(3);
//    }
//    @AfterEach
//    void end(){
//        numbers = null;
//    }
   /* @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    void Test2(int input){*/

    /*ssertThat(numbers.contains(input)).isTrue();
    }
    @ParameterizedTest
    @CsvSource(value={"1:true", "2:true", "3:true", "true:false", "4:false", "5:false"}, delimiter = ':')
    @DisplayName("요구사항 3:\n" +
            "요구사항 2는 contains 메소드 결과 값이 true인 경우만 테스트 가능하다.\n" +
            "입력 값에 따라 결과값이 다른 경우에 대한 테스트도 가능하도록 구현한다.\n" +
            "예를 들어 1, 2, 3 값은 contains 메소드 실행결과 true,\n" +
            "4, 5 값을 넣으면 false 가 반환되는 테스트를 하나의 Test Case로 구현한다.")
    void requireFun c3(String input, boolean result){
        if (1,2,3){// input 값이 1, 2, 3 이면 true) {
        int input = 1,2,3,4,5;


        assertEquals(numbers.contains(Integer.parseInt(input)), result);
    }
*/
//    @paramterizedTest
//    @ValueSource(strings = {"", " " })
//     void isBlank_ShouldReturnForNullorBlankStrings(String input){
//        assertTrue(Strings.isBlank(input));
//    }



//


