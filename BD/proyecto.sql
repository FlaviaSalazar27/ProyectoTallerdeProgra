PGDMP         :                x            Proyecto    12.2    12.2                0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false                       0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false                       0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false                       1262    16415    Proyecto    DATABASE     �   CREATE DATABASE "Proyecto" WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'Spanish_Spain.1252' LC_CTYPE = 'Spanish_Spain.1252';
    DROP DATABASE "Proyecto";
                postgres    false                        2615    16416    proyecto    SCHEMA        CREATE SCHEMA proyecto;
    DROP SCHEMA proyecto;
                postgres    false            �            1259    16447    cliente    TABLE     �   CREATE TABLE proyecto.cliente (
    id_cliente integer,
    nombre text,
    telefono integer,
    email text,
    direccion text,
    fecha_creacion timestamp with time zone
);
    DROP TABLE proyecto.cliente;
       proyecto         heap    postgres    false    6            �            1259    16435    estilo    TABLE     _   CREATE TABLE proyecto.estilo (
    id_estilo integer,
    nombre text,
    descripcion text
);
    DROP TABLE proyecto.estilo;
       proyecto         heap    postgres    false    6            �            1259    16417 
   exposicion    TABLE     �   CREATE TABLE proyecto.exposicion (
    id_exposicion integer,
    titulo text,
    descripcion text,
    fecha_creacion timestamp with time zone
);
     DROP TABLE proyecto.exposicion;
       proyecto         heap    postgres    false    6            �            1259    16453    obra    TABLE     �   CREATE TABLE proyecto.obra (
    id_obra integer NOT NULL,
    titulo text,
    descripcion text,
    precio numeric,
    fecha_creacion timestamp with time zone,
    id_cliente integer,
    id_estilo integer
);
    DROP TABLE proyecto.obra;
       proyecto         heap    postgres    false    6            �            1259    16459    obra_expocision    TABLE     z   CREATE TABLE proyecto.obra_expocision (
    id_obra_exposicion integer,
    id_obra integer,
    id_exposicion integer
);
 %   DROP TABLE proyecto.obra_expocision;
       proyecto         heap    postgres    false    6                      0    16447    cliente 
   TABLE DATA           c   COPY proyecto.cliente (id_cliente, nombre, telefono, email, direccion, fecha_creacion) FROM stdin;
    proyecto          postgres    false    205   �                 0    16435    estilo 
   TABLE DATA           B   COPY proyecto.estilo (id_estilo, nombre, descripcion) FROM stdin;
    proyecto          postgres    false    204   �                 0    16417 
   exposicion 
   TABLE DATA           Z   COPY proyecto.exposicion (id_exposicion, titulo, descripcion, fecha_creacion) FROM stdin;
    proyecto          postgres    false    203                    0    16453    obra 
   TABLE DATA           m   COPY proyecto.obra (id_obra, titulo, descripcion, precio, fecha_creacion, id_cliente, id_estilo) FROM stdin;
    proyecto          postgres    false    206   0                 0    16459    obra_expocision 
   TABLE DATA           W   COPY proyecto.obra_expocision (id_obra_exposicion, id_obra, id_exposicion) FROM stdin;
    proyecto          postgres    false    207   M             x������ � �            x������ � �            x������ � �            x������ � �            x������ � �     