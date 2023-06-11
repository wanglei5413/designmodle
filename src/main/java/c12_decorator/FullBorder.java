package c12_decorator;

/**
 * 具体装饰
 * 上下左右都加一个字符
 */
public class FullBorder extends Border{
    public FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return 1+display.getColumns()+1;
    }

    @Override
    public int getRows() {
        return 1+display.getRows()+1;
    }

    @Override
    public String getRowText(int row) {
        if (row==0){//最上面行
            return "+"+makeLine(display.getColumns())+"+";
        }else if (row==display.getRows()+1){//最下面行
            return "+"+makeLine(display.getColumns())+"+";
        }else{
            return "|"+display.getRowText(row-1)+"|";
        }
    }

    private String makeLine(int columns) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < columns; i++) {
            sb.append("-");
        }
        return sb.toString();
    }
}
