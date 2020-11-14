
package dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ClassesDTO implements Serializable
{

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("results")
    @Expose
    private List<ClassDTO> results = new ArrayList<ClassDTO>();
    private final static long serialVersionUID = -3947278038767221463L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ClassesDTO() {
    }

    /**
     * 
     * @param count
     * @param results
     */
    public ClassesDTO(Integer count, List<ClassDTO> results) {
         System.out.println("ClassDTO" + count);
        this.count = count;
        this.results = results;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ClassesDTO withCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<ClassDTO> getResults() {
        return results;
    }

    public void setResults(List<ClassDTO> results) {
        this.results = results;
    }

    public ClassesDTO withResults(List<ClassDTO> results) {
        this.results = results;
        return this;
    }

}
