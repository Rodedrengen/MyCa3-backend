
package dto;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ClassDTO implements Serializable
{

    @SerializedName("index")
    @Expose
    private String index;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;
    private final static long serialVersionUID = 7734090311583098441L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ClassDTO() {
    }

    /**
     * 
     * @param name
     * @param index
     * @param url
     */
    public ClassDTO(String index, String name, String url) {
        this.index = index;
        this.name = name;
        this.url = url;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public ClassDTO withIndex(String index) {
        this.index = index;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClassDTO withName(String name) {
        this.name = name;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ClassDTO withUrl(String url) {
        this.url = url;
        return this;
    }

}
