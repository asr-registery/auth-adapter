/**
 * 
 */
package af.asr.authadapter.util;

import org.springframework.stereotype.Component;

@Component
public class OtpValidator {

	public void validateOTPUser(OtpUser otpUser) {
		
		if(otpUser.getAppId()==null)
		{
			throw new AuthManagerException(AuthErrorCode.UNAUTHORIZED.getErrorCode(),"Invalid AppId");
		}
		if(otpUser.getContext()==null)
		{
			throw new AuthManagerException(AuthErrorCode.UNAUTHORIZED.getErrorCode(),"Context is null,Please enter a valid context");
		}
		if(otpUser.getOtpChannel()==null)
		{
			throw new AuthManagerException(AuthErrorCode.UNAUTHORIZED.getErrorCode(),"Otp Channel is null,Please enter a valid channel");
		}
		if(otpUser.getUserId()==null)
		{
			throw new AuthManagerException(AuthErrorCode.UNAUTHORIZED.getErrorCode(),"Invalid User id ");
		}
		if(otpUser.getUseridtype()==null)
		{
			throw new AuthManagerException(AuthErrorCode.UNAUTHORIZED.getErrorCode(),"Invalid User id type ");
		}
		if(otpUser.getAppId().equals("preregistration") && otpUser.getOtpChannel().size()>1)
		{
			throw new AuthManagerException(AuthErrorCode.UNAUTHORIZED.getErrorCode(),"Multiple channels are not supported for this application ");
		}
		
	}

}
