public class BirchTree extends Tree implements TreeSound{

    public BirchTree(Integer xPos, Integer yPos) {
        super(xPos, yPos);
        //TODO Auto-generated constructor stub
    }
    Integer sizeTree = 0;

    public void growth() {
        sizeTree = sizeTree + 10;

    }
    public Integer getTreeSize() {
        return sizeTree;
    }

    @Override
    public Freq getSoundType() {
        return Freq.MID;
    }

}
