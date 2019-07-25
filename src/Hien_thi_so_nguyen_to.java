public class Hien_thi_so_nguyen_to {

    public static void main(String[] args) {
        System.out.println("Các số nguyên tố là : ");
        for(int i =0; i<100;i++){
            if (check(i)){
                System.out.println(i);
            }
        }

    }
    public static boolean check(int k){
        if (k<2){
            return  false;
        }else{
            double root = Math.sqrt(k);
            for(int i=2; i<=root; i++) {
                if(k%i==0) {
                    return false;
                }
            }
        }
        return true;

        }

    }



