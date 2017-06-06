# OpenUxAS Yocto Layer and Recipe

**Don't clone this repository directly!**

This repository contains the bitbake recipe for OpenUxAS, a patch that
adds in the generated LMCP files, and a helper script for getting a
build started. This repository will be checked out as a submodule as
part of the instructions below.

## Instructions

1. Clone the afrl-rq fork of the Yocto Poky build repository:
   ```
   $ git clone -b galois-teas-cross git@github.com:afrl-rq/poky-openuxas.git
   ```
1. Initialize submodules (including this repository):
   ```
   $ cd poky-openuxas
   $ git submodule update --init
   ```
1. Source the bootstrap script:
   ```
   $ source meta-openuxas/bootstrap.sh
   ```
1. Follow the instructions that the script prints to set the machine
   type to `odroid-xu4`.
1. Run `bitbake core-image-openuxas` to build the image. *Note:* you
   may need to run this command twice if it initially fails; this
   appears to be a bug with bitbake.
1. Once bitbake finishes, you will have an image ready to flash to an
   sdcard in `tmp/deploy/images/odroid-xu4/`

## Troubleshooting

Send a message to @acfoltzer on the Summer of Innovation Slack.
