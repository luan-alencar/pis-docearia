package doceria.integracao.usuarioservice.service;

import doceria.integracao.usuarioservice.service.dto.EmailDTO;
import doceria.integracao.usuarioservice.service.rabbit.ConsumidorTarget;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
@EnableBinding(ConsumidorTarget.class)
public class ConsumidorService {

    private final EmailService emailService;

    @StreamListener(target = ConsumidorTarget.BINDING_MAILER)
    public void sendMail(@Payload EmailDTO emailDTO) {
        log.info("Evento recebido {}", emailDTO);
        emailService.sendMail(emailDTO);
    }
}
