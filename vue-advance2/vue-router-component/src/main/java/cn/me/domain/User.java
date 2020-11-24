package cn.me.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Accessors(chain = true)
public class User
{
	private Integer id;
	private String name;
	private Integer age;
	//设置东八区，不然会少8小时
	@JsonFormat(pattern = "yyyy-MM-dd", timezone = "GTM+8")
	private Date bir;
}
