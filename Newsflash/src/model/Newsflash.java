package model;

public class Newsflash {
    private String header;
    private String content;
    private int version;

    public Newsflash(String header, String content) {
        this.header = header;
        this.content = content;
        this.version = 1;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return header + " (version " + version + ")";
    }
}
