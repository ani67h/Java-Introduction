class Main{
    public static void main(String[] args) {
        String Num = "123456789";
        String ReverseNum = "";

        for (int i = Num.length() - 1; i >= 0; i--) {
            ReverseNum = ReverseNum + Num.charAt(i);
        } 

        System.out.println("The reverse order of " + Num + " is " + ReverseNum);
    }
}