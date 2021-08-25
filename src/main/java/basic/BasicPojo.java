package basic;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import utils.ToString;

import java.util.Date;

/**
 * @Description：基础类
 */
@AllArgsConstructor
public class BasicPojo extends ToString {

    public BasicPojo() {
    }

    public BasicPojo(Long id) {
        this.id = id;
    }

    /**
     * @Description 主键
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING)
    private Long id;

    @TableField(fill = FieldFill.INSERT)//INSERT代表只在插入时填充
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")//set
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")//get
    protected Date createdTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)// INSERT_UPDATE 首次插入、其次更新时填充(或修改)
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")//set
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")//get
    protected Date updatedTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}
