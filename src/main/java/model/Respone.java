package model;

public class Respone {
    private Boolean status;
    private String messeges;
    private Object data;

    public Respone() {
    }

    public Respone(Boolean status, String messeges, Object data) {
        this.status = status;
        this.messeges = messeges;
        this.data = data;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMesseges() {
        return messeges;
    }

    public void setMesseges(String messeges) {
        this.messeges = messeges;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
