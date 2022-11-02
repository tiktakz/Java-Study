package Chapter8;

class ExceptionEx3 {
    public static void main(String[] args) {
        int number = 100;
        int result = 0;
        for (int i=0; i<10; i++) {
            try {
                result = number / (int)(Math.random()*10); // 숫자를 0으로 나눌 수 있으며 ArithmeticException 발생가능
                System.out.println(result);        
            } catch(Exception e) { //ArithmeticException e 대신 사용
                System.out.println("0");
            }
        }
    }
}