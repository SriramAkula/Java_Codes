class Patterns{
    public static void main(String args[]){
        
        for(int i=0;i<5;i++){
            System.out.print("* ");
            for(int j=4;j>i;j--){
                System.out.print("* ");

            }
            System.out.println("\n");
        }
        // for(int i=0;i<4;i++){
        //     System.out.print(0);
        //     for(int j=0;j<i;j++){
        //         System.out.print(j+1);

        //     }
        //     System.out.println("\n");
        // }
    }
}