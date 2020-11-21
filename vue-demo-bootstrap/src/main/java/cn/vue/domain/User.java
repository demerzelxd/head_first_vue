package cn.vue.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class User
{
	private Integer id;

	@NotBlank(message = "用户名不能为空")
	private String name;

	@NotNull(message = "年龄不能为空")
	private Integer age;

	@NotNull(message = "薪资不能为空")
	private Double salary;

	@NotBlank(message = "手机号不能为空")
	private String phone;
}
