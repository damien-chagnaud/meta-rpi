SUMMARY = "A ScreenyPi image"
HOMEPAGE = "http://www.soualigatech.com"
LICENSE = "MIT"

require qt5-basic-image.bb

QT5_PKGS = " \
    qt3d \
    qtcharts \
    qtdeclarative \
    qtdeclarative-plugins \
    qtdeclarative-qmlplugins \
    qtgraphicaleffects \
    qtlocation-plugins \
    qtmultimedia \
    qtquickcontrols2 \
    qtsensors-plugins \
    qtserialbus \
    qtsvg \
    qtwebsockets-qmlplugins \
    qtvirtualkeyboard \
    qtxmlpatterns \
"


SCREEN = " \
	screenypi \
"


IMAGE_INSTALL += " \
    ${QT5_PKGS} \
"

export IMAGE_BASENAME = "screenypi-image"
