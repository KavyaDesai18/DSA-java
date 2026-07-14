public class Strings {
    
    //To get the shortest path to reach to given point
    public static float getShortestPath(String str){

        int x=0 , y=0;
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'N' : y++;
                            break;
                case 'S' : y--;
                            break;
                case 'E' : x++;
                            break;
                case 'W' : x--;
                            break;
                default:System.out.println("Please enter correct direction!");
                        return 0;
            }
        }
        int x2 = x*x;
        int y2 = y*y;
        return (float)Math.sqrt(x2+y2);
    }

    //Convert first letter of word to upper case
    public static String toUpperCase(String str){

        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == ' ' && i < str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static String compressString(String str) {
    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < str.length(); i++) {

        int count = 1;
        char ch = str.charAt(i);

            while (i < str.length() - 1 && str.charAt(i + 1) == ch) {
                count++;
                i++;
            }

            sb.append(ch);

            if (count > 1) {
              sb.append(count);
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        
        String str = "aaabbccccd";
        //System.out.println(getShortestPath(str));
        //System.out.println(toUpperCase(str));
        System.out.println(compressString(str));

    }
}
