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
	qtwebengine \
	qtwebview \
"


SCREENYPI = " \
	screenypi \
"

IMAGE_INSTALL += " \
    ${QT5_DEV_PKGS} \
    ${QT5_PKGS} \
	${SCREENYPI} \
"

export IMAGE_BASENAME = "screenypi-image"
