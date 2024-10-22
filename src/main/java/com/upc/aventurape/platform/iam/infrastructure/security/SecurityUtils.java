// src/main/java/com/upc/aventurape/platform/iam/infrastructure/security/SecurityUtils.java
package com.upc.aventurape.platform.iam.infrastructure.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

public class SecurityUtils {

    public static Long getCurrentUserId() {
        // 1. Obtener la autenticación actual del contexto de seguridad
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        // 2. Verificar si la autenticación no es nula y si el principal es una instancia de UserDetails
        if (authentication != null && authentication.getPrincipal() instanceof UserDetails) {
            // 3. Obtener el ID del usuario desde UserDetails
            UserDetails userDetails = (UserDetails) authentication.getPrincipal();
            if (userDetails instanceof CustomUserDetails) {
                return ((CustomUserDetails) userDetails).getId();
            }
        }

        // 4. Si no, devolver null
        return null;
    }
}