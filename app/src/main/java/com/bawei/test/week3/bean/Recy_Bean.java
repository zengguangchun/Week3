package com.bawei.test.week3.bean;

import java.util.List;

/**
 * Created by asus on 2016/11/21.
 */
public class Recy_Bean {

    /**
     * error_code : 0
     * reason : Success
     * result : {"data":[{"content":"\u201c我家的狗特威武，月圆之夜尝尝嚎叫，真像一头狼！\u201d甲对乙得意的说道。　　\u201c你知道狼和狗的区别吗？\u201d　　\u201c什么区别？\u201d甲问。　　\u201c狼吃的是人，狗吃的是屎，你说的是狗屎！\u201d","hashId":"c5713f6a07815c540e15fdd8d1df5aeb","unixtime":1479692630,"updatetime":"2016-11-21 09:43:50"},{"content":"近日加班，睡眠不好，终于熬到周末，午觉睡从11点睡到14点。　　刚睁开眼睛，老公心疼地说：\u201c宝贝儿，再睡会儿吧。\u201d　　睡得浑身骨头疼的我懒懒地说：\u201c嗯，歇会儿再睡。\u201d","hashId":"63c803848d910a6e44116b709bb3f269","unixtime":1479692030,"updatetime":"2016-11-21 09:33:50"},{"content":" 　　我有一朋友绰号西瓜，家住某小区五楼。　　一日，我去找他打篮球。当天很热，本人就懒得上楼找他，就站在他家楼下高呼：\u201c西瓜，西瓜。\u201d　　话音刚落，二楼一位阿姨打开了窗户问：\u201c多少钱一斤？\u201d","hashId":"474487ded345b2e7c5f2f02e6a4d3925","unixtime":1479692030,"updatetime":"2016-11-21 09:33:50"},{"content":"前几日一90后小男生想泡我。　　请我在河边烛光晚餐后，绞尽脑汁接下来的活动，最终选择去唱歌。　　点了十瓶啤酒，两人唱歌唱得很嗨。　　喝到第九瓶的时候，只见他神情迷离地望着我说：\u201c你怎么还不醉？\u201d","hashId":"ce4447215e3761576096e8ca93b0b5ff","unixtime":1479691430,"updatetime":"2016-11-21 09:23:50"},{"content":"同寝室的一位大神说他手机下了一首很好听的歌，要当第二天早上闹钟铃声。　　结果第二天早上我们迷迷糊糊听见：\u201c起来，不愿做奴隶的人们\u2026\u2026\u201d","hashId":"868f8f3c3d79486daa4dcff7219966b9","unixtime":1479691430,"updatetime":"2016-11-21 09:23:50"},{"content":"前男友发信息说：明天他结婚，问我去不去。　　我很肯定地说不会去。　　他说：\u201c我知道，那你份子钱呢？\u201d","hashId":"6593b996a5e1bf43ffcbc3b8d7de2c32","unixtime":1479691430,"updatetime":"2016-11-21 09:23:50"},{"content":"看到一个广告。　　一个男的坐在凳子上，旁边的服务员再说：\u201c红烧牛肉面，红烧什么什么面。\u201d　　那个男的说：\u201c诶，怎么老是红烧味？\u201d说着，哗！丢出一包卤肉面。　　我就想问：既然他有面，干嘛还要来面馆呢？","hashId":"8d8938c8d06c210b62599a471b667ef6","unixtime":1479691430,"updatetime":"2016-11-21 09:23:50"},{"content":"同事发牢骚：\u201c你们说好笑不好笑，就一个同学，平时连个电话都不打的、现在他要结婚，昨天送来了请帖，要我随礼。这不明显骗钱吗？\u201d　　有人说：\u201c同学结婚请你，还不是想跟你沟通一下感情？你怎么光想到钱呢？\u201d　　\u201c你们知道是啥同学？在驾校学了三天车！\u201d","hashId":"86bf0c2a5644857116469cfb588c4113","unixtime":1479691430,"updatetime":"2016-11-21 09:23:50"},{"content":"大学时，女友要我每天给她买一个煎饼果子吃。　　大学门口有两家卖，一家卖三块，一家卖三块五。　　但是女友只吃三块五的，原先以为女友觉得三块五的好吃。　　大学毕业前夕分手时我才知道：卖三块五的那家是他们家开的。","hashId":"1321b2852d6c0a1c55ba5e2de24b718a","unixtime":1479691430,"updatetime":"2016-11-21 09:23:50"},{"content":"陆滢89年；孙杨91年；焦刘洋91年；李玄旭94年；叶诗文96年；看着没啥。　　可是当听到解说员说\u201c这是一名92年出生的老将。\u201d顿时感觉这个世界太特么凶残。","hashId":"4e3313a8b418c54261eb2bff3a3492be","unixtime":1479691430,"updatetime":"2016-11-21 09:23:50"}]}
     */

    private int error_code;
    private String reason;
    private ResultBean result;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public static class ResultBean {
        private List<DataBean> data;

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean {
            /**
             * content : “我家的狗特威武，月圆之夜尝尝嚎叫，真像一头狼！”甲对乙得意的说道。　　“你知道狼和狗的区别吗？”　　“什么区别？”甲问。　　“狼吃的是人，狗吃的是屎，你说的是狗屎！”
             * hashId : c5713f6a07815c540e15fdd8d1df5aeb
             * unixtime : 1479692630
             * updatetime : 2016-11-21 09:43:50
             */

            private String content;
            private String hashId;
            private int unixtime;
            private String updatetime;

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getHashId() {
                return hashId;
            }

            public void setHashId(String hashId) {
                this.hashId = hashId;
            }

            public int getUnixtime() {
                return unixtime;
            }

            public void setUnixtime(int unixtime) {
                this.unixtime = unixtime;
            }

            public String getUpdatetime() {
                return updatetime;
            }

            public void setUpdatetime(String updatetime) {
                this.updatetime = updatetime;
            }
        }
    }
}
