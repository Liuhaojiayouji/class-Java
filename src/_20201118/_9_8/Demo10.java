package _20201118._9_8;

public class Demo10 {
    public static void main(String[] args) {
        String ip = "192.168.10.100";
        ip = null;
        try {
            feiQ(ip);
        } catch (NoIpException e) {
            e.printStackTrace();
            System.out.println("马上插网线");
        }
    }

    private static void feiQ(String ip) throws NoIpException {
        if (ip == null) {
            throw new NoIpException("没有插网线");
        }
        System.out.println("正常显示好友列表");
    }
}
