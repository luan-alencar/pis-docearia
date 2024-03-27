package doceria.integracao.usuarioservice.service;

import doceria.integracao.usuarioservice.configuracao.ApplicationProperties;
import doceria.integracao.usuarioservice.service.dto.EmailDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;

@Service
@RequiredArgsConstructor
public class EmailService {

    private static final String ERROR_TITLE = "error.title";

    private final JavaMailSender javaMailSender;

    private final ApplicationProperties properties;

    public void sendMail(EmailDTO emailDTO) {
        try {
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper message = new MimeMessageHelper(mimeMessage, false, "UTF-8");
            message.setTo(emailDTO.getDestinatario());
            message.setFrom(properties.getEnderecoRemetente(), properties.getNomeRemetente());
            message.setSubject(emailDTO.getAssunto());
            for (String s : emailDTO.getCopias()) {
                message.addCc(s);
            }
            message.setText(emailDTO.getCorpo(), true);
            javaMailSender.send(mimeMessage);
        } catch (MessagingException | UnsupportedEncodingException e) {
            throw new RuntimeException( ERROR_TITLE);
        }
    }

}
