package com.fairyoo.fring.configs;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * @author MengYi at 2018-12-28 17:19
 */
@Data
@Configuration
public class FringProperties {

    @Getter @Setter
    private boolean enabled = true;

    @Value("${com.fairyoo.fring.appId}")
    @Getter @Setter
    private int appId;


    @Getter @Setter
    private String[] resultWrapperIgnores = new String[]{"/actuator", "/hystrix", "/swagger-resources", "/error", "/manage"};


    @Getter @Setter
    private FringProperties.Sign sign = new FringProperties.Sign();

    public FringProperties() {
    }

    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof FringProperties)) {
            return false;
        } else {
            FringProperties other = (FringProperties)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.isEnabled() != other.isEnabled()) {
                return false;
            } else if (this.getAppId() != other.getAppId()) {
                return false;
            } else if (!Arrays.deepEquals(this.getResultWrapperIgnores(), other.getResultWrapperIgnores())) {
                return false;
            } else {
                Object this$sign = this.getSign();
                Object other$sign = other.getSign();
                if (this$sign == null) {
                    if (other$sign != null) {
                        return false;
                    }
                } else if (!this$sign.equals(other$sign)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof FringProperties;
    }

    @Override
    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        result = result * 59 + (this.isEnabled() ? 79 : 97);
        result = result * 59 + this.getAppId();
        result = result * 59 + Arrays.deepHashCode(this.getResultWrapperIgnores());
        Object $sign = this.getSign();
        result = result * 59 + ($sign == null ? 43 : $sign.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "MikeProperties(enabled=" + this.isEnabled() + ", appId=" + this.getAppId() + ", resultWrapperIgnores=" + Arrays.deepToString(this.getResultWrapperIgnores()) + ", sign=" + this.getSign() + ")";
    }

    public static class Sign {
        private String key;
        private int timeout = 3600000;
        private boolean enabled = true;
        private String[] ignores = new String[]{"/actuator", "/hystrix", "/swagger-resources", "/error"};

        public Sign() {
        }

        public String getKey() {
            return this.key;
        }

        public int getTimeout() {
            return this.timeout;
        }

        public boolean isEnabled() {
            return this.enabled;
        }

        public String[] getIgnores() {
            return this.ignores;
        }

        public void setKey(final String key) {
            this.key = key;
        }

        public void setTimeout(final int timeout) {
            this.timeout = timeout;
        }

        public void setEnabled(final boolean enabled) {
            this.enabled = enabled;
        }

        public void setIgnores(final String[] ignores) {
            this.ignores = ignores;
        }


        @Override
        public boolean equals(final Object o) {
            if (o == this) {
                return true;
            } else if (!(o instanceof FringProperties.Sign)) {
                return false;
            } else {
                FringProperties.Sign other = (FringProperties.Sign)o;
                if (!other.canEqual(this)) {
                    return false;
                } else {
                    Object this$key = this.getKey();
                    Object other$key = other.getKey();
                    if (this$key == null) {
                        if (other$key != null) {
                            return false;
                        }
                    } else if (!this$key.equals(other$key)) {
                        return false;
                    }

                    if (this.getTimeout() != other.getTimeout()) {
                        return false;
                    } else if (this.isEnabled() != other.isEnabled()) {
                        return false;
                    } else if (!Arrays.deepEquals(this.getIgnores(), other.getIgnores())) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }

        protected boolean canEqual(final Object other) {
            return other instanceof FringProperties.Sign;
        }

        @Override
        public int hashCode() {
            boolean PRIME = true;
            int result = 1;
            Object $key = this.getKey();
            result = result * 59 + ($key == null ? 43 : $key.hashCode());
            result = result * 59 + this.getTimeout();
            result = result * 59 + (this.isEnabled() ? 79 : 97);
            result = result * 59 + Arrays.deepHashCode(this.getIgnores());
            return result;
        }

        @Override
        public String toString() {
            return "MikeProperties.Sign(key=" + this.getKey() + ", timeout=" + this.getTimeout() + ", enabled=" + this.isEnabled() + ", ignores=" + Arrays.deepToString(this.getIgnores()) + ")";
        }
    }
}
