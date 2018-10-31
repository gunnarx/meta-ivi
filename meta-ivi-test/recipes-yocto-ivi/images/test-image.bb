require recipes-yocto-ivi/images/ivi-image.bb

PV = "${DATE}"

IMAGE_INSTALL_append += " \
    audiomanager-test \
    audiomanagerplugins-test \
    bluez5-noinst-tools bluez5-test \ 
    capicxx-perf \
    common-api-c++-dbus-test \
    common-api-test
    dlt-daemon-test \
    glib-2.0-utils \
    node-health-monitor-test \
    node-startup-controller-nsm-dummy \
    node-state-manager-test \
    openssh \
    persistence-administrator-test \
    persistence-client-library-test \
    persistence-common-object-test \
    test-fw \
    vsomeip-test \
    wayland-ivi-extension-test \
"

EXTRA_USERS_PARAMS = ""
