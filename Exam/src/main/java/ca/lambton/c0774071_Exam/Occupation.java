package ca.lambton.c0774071_Exam;

import javax.validation.constraints.Min;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Occupation {
	
	private String title;
	
	@Min(1)
	private int salary;

}
