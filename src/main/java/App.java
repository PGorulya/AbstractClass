import java.util.ArrayList;
import java.util.List;


public class App {

    public static void main(String[] args) {

        BirchTree birch = new BirchTree(10,10);
        OakTree oak = new OakTree( 20,20);

        birch.growth();
        oak.growth();

        System.out.println("Birch: " + birch.getTreeSize());
        System.out.println("Oak: " + oak.getTreeSize());

// option 1
/*
        List<Tree> trees = new ArrayList<>();

        trees.add(oak);
        trees.add(birch);
        System.out.println("List trees: " + trees.toString());

        for (int i = 0; i < 5; i++) {
            for (Tree tree : trees) {
                 tree.growth();
                if (tree instanceof TreeSound) {
                    System.out.println(((TreeSound) tree).getSoundType() );
                }

            }

        }
*/

// option 2 (compilation error!)
/*
        List<Object> trees = new ArrayList<>();

        trees.add(oak);
        trees.add(birch);
        System.out.println("List trees: " + trees.toString());

        for (int i = 0; i < 5; i++) {
            for (Object tree : trees) {
                 tree.growth();
                if (tree instanceof TreeSound) {
                    System.out.println(((TreeSound) tree).getSoundType() );
                }

            }

        }
*/

// option 3

        List<Object> trees = new ArrayList<>();

        trees.add(oak);
        trees.add(birch);
        System.out.println("List trees: " + trees.toString());

        for (int i = 0; i < 5; i++) {
            for (Object tree : trees) {
 //               ((Tree) tree).growth();
                if (tree instanceof BirchTree) {
                    ((BirchTree) tree).growth();
                }
                if (tree instanceof OakTree) {
                    ((OakTree) tree).growth();
                }
                if (tree instanceof TreeSound) {
                    System.out.println(((TreeSound) tree).getSoundType() );
                }

            }

        }

        System.out.println("List trees: " + trees.toString());

        System.out.println("Birch: " + birch.getTreeSize());
        System.out.println("Oak: " + oak.getTreeSize());

    }

}
