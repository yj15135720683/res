package cn.pojo;

import java.util.Date;

public class GoodsForm {
    /**
     * 商品实体类
     */
    private Integer gid;    //商品ID
    private String gname;   //商品名
    private float gprice;   //商品价格
    private String ginfo;   //商品信息
    private String gimage;  //商品展示图片（上）
    private String ginfoimage;  //商品信息图片
    private Date gdate;     //上架时间
    private Integer sid;    //商家ID
    private Integer gstate; //商品状态
    private Integer tid;    //商品种类ID

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public float getGprice() {
        return gprice;
    }

    public void setGprice(float gprice) {
        this.gprice = gprice;
    }

    public String getGinfo() {
        return ginfo;
    }

    public void setGinfo(String ginfo) {
        this.ginfo = ginfo;
    }

    public String getGimage() {
        return gimage;
    }

    public void setGimage(String gimage) {
        this.gimage = gimage;
    }

    public String getGinfoimage() {
        return ginfoimage;
    }

    public void setGinfoimage(String ginfoimage) {
        this.ginfoimage = ginfoimage;
    }

    public Date getGdate() {
        return gdate;
    }

    public void setGdate(Date gdate) {
        this.gdate = gdate;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getGstate() {
        return gstate;
    }

    public void setGstate(Integer gstate) {
        this.gstate = gstate;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }
}
