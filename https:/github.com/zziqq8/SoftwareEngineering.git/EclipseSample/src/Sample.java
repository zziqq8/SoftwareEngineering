import java.util.Random;
public class Sample {
    public static void main(String[] args) {
        Random rand = new Random();
        System.out.println("あなたの運勢占います");
        int fortune=rand.nextInt(6)+1;     
        switch(fortune){
            case 1:
                System.out.println("大吉");
                break;
            case 2:
                System.out.println("中吉");
                break;
            case 3:
                System.out.println("吉");
                break;
            case 4:
            	System.out.println("末吉");
         		break;
            case 5:
            	System.out.println("凶");
            	break;
            default:
                System.out.println("大凶");            
        }
        
        System.out.println("ラッキーカラーをお教えします");
        int fortune_c=rand.nextInt(6)+1;     
        switch(fortune_c){
            case 1:
                System.out.println("赤");
                break;
            case 2:
                System.out.println("青");
                break;
            case 3:
                System.out.println("黄色");
                break;
            case 4:
            	System.out.println("緑");
         		break;
            case 5:
            	System.out.println("白");
            	break;
            default:
                System.out.println("紫");            
        }
    }    
}
