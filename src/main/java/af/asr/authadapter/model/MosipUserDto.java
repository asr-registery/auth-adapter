package af.asr.authadapter.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * MOSIP USER IS THE STANDARD SPEC THAT WILL BE TUNED BASED ON THE DETAILS
 * STORED IN LDAP FOR A USER
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MosipUserDto {
	private String userId;
	private String mobile;
	private String mail;
	private String langCode;
	private byte[] userPassword;
	private String name;
	private String role;
	private String rId;
}