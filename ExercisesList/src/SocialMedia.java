import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SocialMedia {
    public static void main(String[] args) {
        Set<String> followers = new HashSet<String>();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("\n-=-=-=-=  Social Media Followers -=-=-=-=" +
                    "\n[1] Add follower" +
                    "\n[2] Remove follower" +
                    "\n[3] Search follower" +
                    "\n[4] View followers list" +
                    "\n[5] Total followers" +
                    "\n\nChoose an option: ");

            int option = sc.nextInt();

            switch (option) {

                case 1:
                    System.out.print("Follower name: ");
                    String follower = sc.next().toLowerCase();
                    followers.add(follower);
                    System.out.println("Follower added");
                    break;

                case 2:
                    System.out.print("Follower name to remove: ");
                    String removeFollower = sc.next().toLowerCase();
                    boolean removed = followers.contains(removeFollower);
                    if (removed){
                        followers.remove(removeFollower);
                        System.out.println("Follower removed");
                    } else {
                        System.out.println("Follower not found");
                    }
                    break;

                case 3:
                    System.out.println("Which follower do you want to search: ");
                    String searchFollower = sc.next();
                    if (followers.contains(searchFollower)){
                        System.out.println("Follower found");
                        System.out.println(followers);
                    } else {
                        System.out.println("Follower not found");
                    }
                    break;
                case 4:
                    System.out.println(followers);
                    break;
                case 5:
                    System.out.printf("Total followers: %d",followers.size());
                    break;
            }
        }
    }
}