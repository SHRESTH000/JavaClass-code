public class Plus {
    public static void main(String[] args) {
        int row=5;
        for(int i=1;i<=row*2-1;i++){
            if(i!=row){
                for(int j=1;j<=row;j++){
                    if(j==row){
                        System.out.print("*");
                    }System.out.print(" ");
                }
            }
            else{
                for(int k=1;k<=row*2-1;k++){
                    System.out.print("*");
                }
            }System.out.println();
        }
        
    }
}
