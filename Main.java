

public class Main {
  
        static int cwzi(int arr[][],int n){
            int index=0;
            int max=0;
            for(int j=0;j<n;j++){
                int count=0;
                 for(int i=0;i<n;i++){
                    int val = arr[i][j];
                    System.out.println("j : "+j+" i : "+i+" v : "+val);
                    if(arr[i][j]==0){
                        count++;
                    }
                 }
    
                 System.out.println(count+" j : " + j);
                
              
                 if(max<count){
                    System.err.println("biggest : "+ count+" max : "+max);
                    max=count;
                    index=j;
                  }
             
            }
            return index;
        }
        public static void main(String[] args) {
            int[][] arr={{1,1,1,0},{1,1,0,0},{1,1,1,1},{1,1,1,1}};
            // cwzi(arr,4);
            System.out.println("final : "+cwzi(arr,4));
        }
    
}
