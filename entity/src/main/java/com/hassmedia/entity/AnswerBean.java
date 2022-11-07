package com.hassmedia.entity;

public class AnswerBean {
    //{"answer":{"text":"今天郑州全天晴，气温-1℃ ~ 9℃，空气质量良，有西风微风，有点冷。"},"text":"郑州天气","type":"answer"}
    private AnswerBean answer;
    private String text;
    private String type;

    public AnswerBean getAnswer() {
        return answer;
    }

    public void setAnswer(AnswerBean answer) {
        this.answer = answer;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static class AnswerChildBean {
        private String text;

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }
    }
}
