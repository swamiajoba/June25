package com.bean;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class ReleaseNote {
	  private String version;
	  private LocalDateTime date;
	  private String changeLogData;
}
